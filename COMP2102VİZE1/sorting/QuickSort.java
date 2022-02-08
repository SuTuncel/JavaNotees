package COMP2102VİZE1.sorting;

import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        Random rnd = new Random();
        int [] numbers = new int[5];

        for (int i =0; i< numbers.length; i++){
            numbers[i]= rnd.nextInt(10);
        }

        System.out.println("Before: ");
        printArray(numbers);
        quickSort(numbers);
        System.out.println("\nAfter: ");
        printArray(numbers);
        System.out.println("\n");
        nearest(numbers,1,numbers.length-1);

    }

    public  static void nearest(int [] array,int low, int high){

        int pivot = array[high];
        int left =low-1;
        int right= high-1;
        int min = array[1]-array[0];
        for (int i =low; i<right; i++){
            if(array[left]<pivot){
                left++;
                swap(array, left, i);
            }
            if (pivot-array[left]< min){
                min = pivot-array[left];
            }
        }
        swap(array,left+1,high);

        System.out.println("Min: "+ min);

    }

    private static void quickSort(int[] array){
        quickSort(array, 0, array.length-1);

    }

    private static void quickSort(int [] array, int low, int high){
        if(low>=high){
            return;
        }

        int pivot= array[high];

        int leftPointer = partition(array,low,high,pivot);
        quickSort(array,low,leftPointer-1);
        quickSort(array,leftPointer+1,high);


    }

    private static int partition(int [] array , int low, int high, int pivot){
        int left = low-1;
        int right = high-1;

        for(int i = low; i<=right; i++) {
            if (array[i] < pivot) {
                left++;
                swap(array, left, i);
            }
        }
            swap(array,left+1,high);
            return left+1;

    }

    private static void swap(int [] array, int index1, int index2){
        int temp = array[index1];
        array[index1]= array[index2];
        array[index2]= temp;
    }

    private static void printArray(int [] array){
        for(int a: array){
            System.out.print(a+" ");
        }
    }

}
