package COMP2102VİZE1.sorting;

import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        Random rnd = new Random();
        int [] numbers = new int[10];
        for (int i =0; i< numbers.length; i++){
            numbers[i]= rnd.nextInt(100);
        }

        System.out.println("Before: ");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("\nAfter: ");
        printArray(numbers);
    }

    private static void insertionSort(int [] array){
       for(int i=0; i< array.length; i++){
           int currentVal = array[i];
           int j = i-1;
           while(j>=0 && array[j]> currentVal){
               array[j+1]= array[j];
               j--;
           }
           array[j+1]=currentVal;
       }
    }

    private static void printArray(int [] array){
        for(int i: array){
            System.out.print(i+" ");
        }
    }
}
