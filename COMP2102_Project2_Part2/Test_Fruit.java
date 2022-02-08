package COMP2102_Project2_Part2;

import java.util.Scanner;

public class Test_Fruit {
    public static void main(String[] args) {
        FruitHashTable2<String> table = new FruitHashTable2<>(150);
        table.readingFilesAndAddToHashTable();

        Scanner ftable = new Scanner(System.in);
        System.out.println("Welcome...\n"+ "Press 'q' for quit.");
        while(true) {
            System.out.print("Enter a fruit: ");
            String fruit = ftable.nextLine();
            if(fruit.equals("q")){
                System.out.println("bye bye...");
                break;
            }else {
                table.searchString(fruit);
            }
        }
    }
}
