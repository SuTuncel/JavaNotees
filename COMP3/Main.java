package COMP3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner pink = new Scanner(System.in);
        Graph graph = new Graph();
        graph.readFileGOTGraph();
        System.out.println("Welcome Game of Thrones Network...");
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        String menu = "1. Print Closest Characters\n"+
                     "2. Print Farther Characters\n"+
                     "3. Find characters are connected\n"+
                     "4. Print shortest path(s) between characters\n"+
                     "5. Delete the connection between characters\n"+
                     "6. Updates the connection strength between characters\n"+
                     "7. Print the connected components and characters in each component\n"+
                     "8. Enter 8 for quit";
        System.out.println(menu);
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        while(true){
            System.out.print("Please enter a number: ");
            String chosen = pink.nextLine();
            if(chosen.equals("8")){
                System.out.println("Bye bye...");
                break;
            }
            else if (chosen.equals("1")){
                System.out.print("Enter a character: ");
                String character= pink.nextLine();
                System.out.print("Enter a number: ");
                int number = pink.nextInt();
                System.out.println("Closest characters: ");
                graph.printClosestCharacters(character,number);
            }
            else if(chosen.equals("2")){
                System.out.print("Enter a character: ");
                String character= pink.nextLine();
                System.out.print("Enter a number: ");
                int number = pink.nextInt();
                System.out.println("Farther characters: ");
                graph.printFartherCharacters(character,number);
            }
            else if(chosen.equals("3")) {
                System.out.print("Enter a character1: ");
                String character1= pink.nextLine();
                System.out.print("Enter a character2: ");
                String character2= pink.nextLine();
                graph.areCharactersConnected(character1,character2);
            }
            else if(chosen.equals("4")){
                System.out.print("Enter a character1: ");
                String character1= pink.nextLine();
                System.out.print("Enter a character2: ");
                String character2= pink.nextLine();
                System.out.println("Shortest path(s) between "+character1+" and "+character2);
            }
            else if(chosen.equals("5")){
                System.out.print("Enter a character1: ");
                String character1= pink.nextLine();
                System.out.print("Enter a character2: ");
                String character2= pink.nextLine();
                graph.delete(character1,character2);
                System.out.println("The connection between "+character1+ " and "+character2 +" is deleted");
            }
            else if(chosen.equals("6")){
                System.out.print("Enter source character: ");
                String character1= pink.nextLine();
                System.out.print("Enter a character2: ");
                String character2= pink.nextLine();
                System.out.print("Enter new weight: ");
                int weight = pink.nextInt();
                graph.change(character1,character2,weight);
                System.out.println("Weight has changed with new weight: "+weight);
            }
            else if(chosen.equals("7")){
                System.out.println("Connected components");
            }
        }
    }
}