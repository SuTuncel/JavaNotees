package COMP2102_Project2_Part2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FruitHashTable2<String> {
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
    int arraySize;
    LinkedList<java.lang.String> [] fruitTable;
    int numberofFruit;

    public FruitHashTable2(int size){
        arraySize = size;
        fruitTable = new LinkedList[size];
        for(int i=0; i<fruitTable.length; i++){
            fruitTable[i]= new LinkedList<>();
        }
    }

    public int hash(java.lang.String fruit) {
        return ((fruit.hashCode() & 0x7ffffff) % arraySize);
    }

    public void insertFruit(java.lang.String fruit){
        if(fruit.equals(" ")){
            throw new IllegalArgumentException();
        }
        int k = hash(fruit);

        if(numberofFruit == arraySize){

            return;
        }
        while(fruitTable[k]!=null){
            if(k==hash(fruit)){ //

                return;
            }
            k=(k+1)%arraySize;
        }
        fruitTable[k]= new LinkedList<>();
        numberofFruit++;
    }

    public void readingfile(File file){
        Scanner scanner;
        try{
            FileReader fileReader = new FileReader(file);
            scanner = new Scanner(new BufferedReader(fileReader));
            while(scanner.hasNextLine()){
                java.lang.String fruit = scanner.nextLine();
                insertFruit(fruit);
                if(contains(fruit)){
                    insertingLinkedList(fruit,file);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void readingFilesAndAddToHashTable() {
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
    }

    public boolean contains(java.lang.String fruit){
        int index = hash(fruit);
        int startIndex = index;
        while (fruitTable[index]!=null && (index + 1 != startIndex)) {
            if (index==hash(fruit))
                return true;

            index = (index+ 1) % arraySize;
        }
        return false;
    }

    public void insertingLinkedList(java.lang.String fruit, File file){
        int k = hash(fruit);
        fruitTable[k].insertLast(file.getName());
    }

    public java.lang.String toString(){
        java.lang.String s = "\n";
        for(int i = 0; i < arraySize; i++){
            s+=i+"th is:"+fruitTable[i].toString()+"\n";
        }
        return s;
    }

    public void searchString(java.lang.String fruit){
        int k = hash(fruit);
        for (int i =0; i< fruitTable.length; i++){
            if (i==k){
                System.out.println("File(s): "+ fruitTable[i].toString());
            }
        }
    }
}
