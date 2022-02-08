package Comp2102_Project3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Graph {
    // public HashMap<String, LinkedList<SeriesCharacter>> GOT_Map = new HashMap<>();
    public HashMap<String, LinkedList<SeriesCharacter>> GOT_Map;

    public void readFile() { // String fileName
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("got-edges.csv")))) {
            while (scanner.hasNextLine()) {
                String lineInformation = scanner.nextLine();
                if (!lineInformation.equals("")) {
                    String[] array = lineInformation.split(",");
                    addEdges(array[0], array[1], Integer.parseInt(array[2]));
          /*SeriesCharacter newCharacter = new SeriesCharacter(array[0], array[1], Integer.parseInt(array[2]));
          System.out.println(newCharacter.toString());
          System.out.println("<====================================>");
          GOT_Map.put(array[0], new LinkedList<>());

          GOT_Map.get(array[0]).add(newCharacter);
          System.out.println(GOT_Map.get(array[0]).toString());*/
                }
            }
            // printGraph();
      /*System.out.println("<====================================>");
      printClosestCharacters("Sansa", 15);
      System.out.println("<====================================>");
      printFartherCharacters("Brienne", 1);
      System.out.println("<====================================>");*/
        } catch (IOException fileNotFoundException) {
            // fileNotFoundException.printStackTrace();
        }
    }

    public HashMap readFileGOTGraph() {
        GOT_Map = new HashMap<>();
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("got-edges.txt")))) {
            while (scanner.hasNextLine()) {
                String lineInformation = scanner.nextLine();
                if (!lineInformation.equals("")) {
                    String[] array = lineInformation.split(",");
                    addEdges(array[0], array[1], Integer.parseInt(array[2]));
                }
            }
            // updateGraph();
            printGraph();
            return GOT_Map;
           // return updateGraph();
        } catch (IOException fileNotFoundException) {
            // fileNotFoundException.printStackTrace();
        }
        return null;
    }

  /*  public HashMap updateGraph() {

        //System.out.println(key + ": " + GOT_Map.get(key));
        }
        GOT_Map.clear();
        GOT_Map = tempHashMap;
        return tempHashMap;*/


    public void removeThing(String source, String destination) {
        LinkedList<SeriesCharacter> sourceList = GOT_Map.get(source);
        SeriesCharacter seriesCharacter = search(source, destination);

        if (sourceList.contains(seriesCharacter)) {
            sourceList.remove(seriesCharacter);
        } else {
            System.out.println("No such thing");
        }
    }

    public SeriesCharacter search(String source, String destination) {
        LinkedList<SeriesCharacter> sourceList = GOT_Map.get(source);
        for (SeriesCharacter character : sourceList) {
            if (character.destination.equals(destination)) {
                return character;
                // System.out.println(character.toString());
            }
        }
        return null;
    }

    public void changeWeight(String source, String destination, int newWeight){
        LinkedList<SeriesCharacter> sourceList = GOT_Map.get(source);
        SeriesCharacter character = search(source,destination);
        if(sourceList.contains(character)) {
            character.setWeight(newWeight);
        }
    }

    public void printGraph() {
        for (String key : GOT_Map.keySet()) {
            System.out.println(key + ": " + GOT_Map.get(key));
        }
    }

    public void printClosestCharacters(String source, int threshold) {
        LinkedList<SeriesCharacter> sourceList = GOT_Map.get(source);
        for (SeriesCharacter character : sourceList) {
            if (character.weight <= threshold) {
                System.out.println(character.toString());
            }
        }
    }

    public void printFartherCharacters(String source, int threshold) {
        LinkedList<SeriesCharacter> sourceList = GOT_Map.get(source);
        for (SeriesCharacter character : sourceList) {
            if (character.weight >= threshold) {
                System.out.println(character.toString());
            }
        }
    }

    public void addVertex(String name) {
        GOT_Map.put(name, new LinkedList<>());
    }

    public void addEdges(String source, String destination, int weight) {
        if (!GOT_Map.containsKey(source)) {
            addVertex(source);
        }
        if (!GOT_Map.containsKey(destination)) {
            addVertex(destination);
        }
        GOT_Map.get(source).add(new SeriesCharacter(source, destination, weight));
        GOT_Map.get(destination).add(new SeriesCharacter(destination, source, weight));
    }

    public void removeVertex(String name) {
        GOT_Map.remove(name);
    }

    /*public void removeVertexes(String name, String name2) {
      GOT_Map.remove(name);
      GOT_Map.remove(name2);
    }*/
    public void removeEdges(String character1, String character2) {
        LinkedList<SeriesCharacter> character1List = GOT_Map.get(character1);
        LinkedList<SeriesCharacter> character2List = GOT_Map.get(character2);
        for (SeriesCharacter character : character1List) {
            if (character.destination.equals(character2)) {
                character1List.remove(character);
                break;
            }
        }
        // updateGraph(GOT_Map);
        for (SeriesCharacter character : character2List) {
            if (character.destination.equals(character1)) {
                character2List.remove(character);
                break;
            }
        }
        // updateGraph(GOT_Map);
    }
  /*GOT_Map.get(source).removeIf(character -> character.destination.equals(source));
    GOT_Map.get(destination).removeIf(character -> character.source.equals(destination));*/

}