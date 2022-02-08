package COMP2102_Project2_Part2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FruitHashTable {
    String[] table;
    int fruitArraySize;
    int numberofFruit;
    File f1 = new File("1.txt");
    File f2 = new File("2.txt");
    File f3 = new File("3.txt");
    File f4 = new File("4.txt");
    File f5 = new File("5.txt");
    File f6 = new File("6.txt");
    File f7 = new File("7.txt");
    File f8 = new File("8.txt");
    File f9 = new File("9.txt");
    File f10 = new File("10.txt");


    public FruitHashTable(int arraySize){
        fruitArraySize=arraySize;
        table = new String[arraySize];
    }

    public int hash(String t) { // string ifadeyi anahtara dönüştürmek
        return ((t.hashCode() & 0x7fffffff) % fruitArraySize);
    }

    public boolean insertFruit(String fruit){
        int k = hash(fruit);
        System.out.println("Hash key: "+k);
        if(numberofFruit == fruitArraySize){
            System.out.println("The table is full\n");
            return false;
        }
        while(table[k]!=null){
            if(table[k].equals(fruit)){
                System.out.println(": Table has the fruit");
                return false;
            }
            k= (k+1)%fruitArraySize;
        }
        table[k]= fruit;
        numberofFruit++;
        return true;

    }

    public void readingfile(File file){
        Scanner scanner;
        try{
            scanner = new Scanner(new BufferedReader(new FileReader(file)));
            while(scanner.hasNextLine()){
                String fruit = scanner.nextLine();
                insertFruit(fruit);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void readingFilesAndAddToHashTable(){
        readingfile(f1);
        readingfile(f2);
        readingfile(f3);
        readingfile(f4);
        readingfile(f5);
        readingfile(f6);
        readingfile(f7);
        readingfile(f8);
        readingfile(f9);
        readingfile(f10);

      /*  Scanner scanner1,scanner2,scanner3,scanner4,scanner5,scanner6,scanner7,scanner8,scanner9,scanner10;
        try{
            scanner1 = new Scanner(new BufferedReader(new FileReader(f1)));
            while (scanner1.hasNextLine()){
                String fruit = scanner1.nextLine();
                insertFruit(fruit);
            }
            scanner2 = new Scanner(new BufferedReader(new FileReader(f2)));
            while (scanner2.hasNextLine()){
                String fruit = scanner2.nextLine();
                insertFruit(fruit);
            }
            scanner3 = new Scanner(new BufferedReader(new FileReader(f3)));
            while (scanner3.hasNextLine()){
                String fruit = scanner3.nextLine();
                insertFruit(fruit);
            }
            scanner4 = new Scanner(new BufferedReader(new FileReader(f4)));
            while (scanner4.hasNextLine()){
                String fruit = scanner4.nextLine();
                insertFruit(fruit);
            }
            scanner5 = new Scanner(new BufferedReader(new FileReader(f5)));
            while (scanner5.hasNextLine()){
                String fruit = scanner5.nextLine();
                insertFruit(fruit);
            }
            scanner6 = new Scanner(new BufferedReader(new FileReader(f6)));
            while (scanner6.hasNextLine()){
                String fruit = scanner6.nextLine();
                insertFruit(fruit);
            }
            scanner7 = new Scanner(new BufferedReader(new FileReader(f7)));
            while (scanner7.hasNextLine()){
                String fruit = scanner7.nextLine();
                insertFruit(fruit);
            }
            scanner8 = new Scanner(new BufferedReader(new FileReader(f8)));
            while (scanner8.hasNextLine()){
                String fruit = scanner8.nextLine();
                insertFruit(fruit);
            }
            scanner9 = new Scanner(new BufferedReader(new FileReader(f9)));
            while (scanner9.hasNextLine()){
                String fruit = scanner9.nextLine();
                insertFruit(fruit);
            }
            scanner10 = new Scanner(new BufferedReader(new FileReader(f10)));
            while (scanner10.hasNextLine()){
                String fruit = scanner10.nextLine();
                insertFruit(fruit);
            }
            scanner1.close();
            scanner2.close();
            scanner3.close();
            scanner4.close();
            scanner5.close();
            scanner6.close();
            scanner7.close();
            scanner8.close();
            scanner9.close();
            scanner10.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
    }


    public String toString(){
        String s = "[";
        for(int i = 0; i < fruitArraySize; i++){
            s+=table[i]+",\n";
        }
        return s+"]";
    }

}
