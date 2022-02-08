package COMP3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Graph {
    public LinkedList<SeriesCharacter> seriesCharacterLinkedLinkedList = new LinkedList<>();
    public HashMap<String, LinkedList<SeriesCharacter>> GOT_Map;

    public HashMap<String, LinkedList<SeriesCharacter>> readFileGOTGraph() {
        GOT_Map = new HashMap<>();
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("got-edges.csv")))) {
            while (scanner.hasNextLine()) {
                String lineInformation = scanner.nextLine();
                if (!lineInformation.equals("")) {
                    String[] array = lineInformation.split(",");
                    addEdges(array[0], array[1], Integer.parseInt(array[2]));

                }
            }

            updateGraph();
            return GOT_Map;

        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        return null;
    }


    public void updateGraph() {
        HashMap<String, LinkedList<SeriesCharacter>> tempHashMap = new HashMap<>(GOT_Map);
        tempHashMap.putAll(GOT_Map);
        GOT_Map.clear();
        GOT_Map = tempHashMap;
    }

    public void delete(String source, String destination) {
        LinkedList<SeriesCharacter> sourceList = GOT_Map.get(source);
        SeriesCharacter seriesCharacter = search(source, destination);

        if (sourceList.contains(seriesCharacter)) {
            sourceList.remove(seriesCharacter);
        } else {
            System.out.println("No such thing");
        }
        this.updateGraph();
    }

    public SeriesCharacter search(String source, String destination) {
        LinkedList<SeriesCharacter> sourceList = GOT_Map.get(source);
        for (SeriesCharacter character : sourceList) {
            if (character.destination.equals(destination)) {
                return character;

            }
        }
        return null;
    }

    public void change(String source, String destination, int weight) {
        LinkedList<SeriesCharacter> sourceList = GOT_Map.get(source);
        SeriesCharacter seriesCharacter = search(source, destination);
        if (sourceList.contains(seriesCharacter)) {
            seriesCharacter.setWeight(weight);
        }
        updateGraph();
    }

    public void printGraph() {
        for (String key : GOT_Map.keySet()) {
            System.out.println(key + ": " + GOT_Map.get(key));
        }
    }

    public void printClosestCharacters(String source, int threshold) {
        LinkedList<SeriesCharacter> sourceList = GOT_Map.get(source);
        for (SeriesCharacter character : sourceList) {
            if (character.weight < threshold) {
                System.out.println(character.toString());
            }
        }
    }

    public void printFartherCharacters(String source, int threshold) {
        LinkedList<SeriesCharacter> sourceList = GOT_Map.get(source);
        for (SeriesCharacter character : sourceList) {
            if (character.weight > threshold) {
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
        SeriesCharacter seriesCharacter1 = new SeriesCharacter(source, destination, weight);
        SeriesCharacter seriesCharacter2 = new SeriesCharacter(destination, source, weight);
        GOT_Map.get(source).add(seriesCharacter1);
        seriesCharacterLinkedLinkedList.add(seriesCharacter1);
        GOT_Map.get(destination).add(seriesCharacter2);
        seriesCharacterLinkedLinkedList.add(seriesCharacter2);
    }



    public boolean isConnected(String character1, String character2){
        LinkedList<SeriesCharacter> character1List = GOT_Map.get(character1);
        LinkedList<SeriesCharacter> character2List = GOT_Map.get(character2);
        for (int i =0; i< character2List.size();i++ ) {
            for(int j =0; j<character1List.size(); j++) {
                if (character1List.get(j).source.equals(character2List.get(i).destination)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void areCharactersConnected(String character1, String character2){
        if(isConnected(character1,character2)){
            System.out.println(character1+" and "+character2+ " are connected.");
        }else{
            System.out.println(character1+" and "+character2+ " are not connected.");
        }
    }

    public void depthFirstSearchUtil(String character, boolean visited[]) {
        for (int i = 0; i < GOT_Map.get(character).size(); i++) {
            if (!visited[i]) {
                System.out.println(GOT_Map.get(character).get(i).source + " " + GOT_Map.get(character).get(i).destination + " " + GOT_Map.get(character).get(i).weight);
                visited[i] = true;
                depthFirstSearchUtil(GOT_Map.get(character).get(i).destination, visited);
            } else {
                System.out.println("Already Visited => " + GOT_Map.get(character).get(i).source + " " + GOT_Map.get(character).get(i).destination + " " + GOT_Map.get(character).get(i).weight);
                // System.out.println("Already visited");
            }
        }
    }

    public void depthFirstSearch(String source) {
        LinkedList<SeriesCharacter> characterList = GOT_Map.get(source);
        boolean[] visited = new boolean[GOT_Map.size()];
        for (int i = 0; i < characterList.size(); i++) {
            if (!visited[i]) {
                depthFirstSearchUtil(source, visited);
            }
        }
    }
}