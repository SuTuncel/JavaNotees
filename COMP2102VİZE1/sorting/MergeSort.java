package COMP2102VİZE1.sorting;

import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {
        Random rnd = new Random();
        int [] numbers = new int[10];

        for (int i =0; i< numbers.length; i++){
            numbers[i]= rnd.nextInt(1000);
        }

        System.out.println("Before: ");
        printArray(numbers);
        mergeSort(numbers);
        System.out.println("\nAfter: ");
        printArray(numbers);

    }

    private static void mergeSort(int [] array){
        int l = array.length;

        if (l<2){
            return;
        }
        int minIndex =l/2;

        int [] leftside = new int[minIndex];
        int [] rightsize = new int[l-minIndex];

       for(int i =0; i< minIndex; i++){
           leftside[i]= array[i];
       }

       for (int i =minIndex; i< l; i++){
           rightsize[i-minIndex]= array[i];
       }
       mergeSort(leftside);
       mergeSort(rightsize);

       merge(array,leftside,rightsize);
    }

    private static void merge (int[] array, int[] left, int[] right) {
        int l = left.length;
        int r = right.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < l && j < r) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < l) {
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < r) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    private static void printArray(int [] array){
        int l = array.length;

        for (int i =0; i< l; i++){
            System.out.print(array[i]+" ");
        }

    }
}
