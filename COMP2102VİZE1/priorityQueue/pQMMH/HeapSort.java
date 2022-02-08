package COMP2102VİZE1.priorityQueue.pQMMH;

import java.util.PriorityQueue;

public class HeapSort <T extends Comparable<? super T>> {
    public static void main(String[] args) {
        int[] ar ={3,5,7,10,11,0,20,8,13,11,9,80,42};

        print(ar);
        System.out.println("\nAfter sort: ");
        sort(ar);
        print(ar);

        String[] arrayOfStrings = {"Andree", "Leana", "Faviola",
                "Loyce", "Quincy", "Milo", "Jamila", "Toccara",
                "Nelda", "Blair", "Ernestine", "Chara", "Kareen",
                "Monty", "Rene", "Cami", "Winifred", "Tara",
                "Demetrice", "Azucena"};

        HeapSort<String> stringSorter = new HeapSort<>();
        stringSorter.heapSort(arrayOfStrings);

        System.out.println(java.util.Arrays.toString(arrayOfStrings));

    }

    public void heapSort(T[] array){
        int size =array.length;
        for(int i =size/2 -1; i>=0; i--){
            heapify(array,size,i); // cerates a max heap
        }

        for (int i=size-1; i>=0; i--){
            T temp = array[0];
            array[0]= array[i];
            array[i]=temp;

            heapify(array,i,0);
        }
    }

    public void heapify(T[] array, int size, int i){
        int max=i;
        int left= 2*i+1;
        int right= 2*i+2;

        if(left<size && array[left].compareTo(array[max])>0){
            max=left;
        }
        if(right<size && array[right].compareTo(array[max])>0){
            max=right;
        }
        if(max!=i){
            T temp = array[i];
            array[i]= array[max];
            array[max]=temp;

            heapify(array, size, max);
        }
    }

    public static void sort(int [] arIn){
        int N = arIn.length-1;

        for(int k=N/2; k>=0; k--){
            sink(arIn,k,N);
        }
        System.out.println("Heapfied: ");
        print(arIn);

        for(int k= arIn.length-1; k>0;){
            swap(arIn,0,k--);
            sink(arIn,0,k);
        }
    }

    public static void sink(int [] ar, int k, int hi){
        while((2*k+1)<=hi){
            int mx= 2*k+1;

            if((mx+1)<=hi && ar[mx]< ar[mx+1]){
                mx =2*k+2;
            }
            if(ar[k]>=ar[mx]){
                break;

            }
            swap(ar,k,mx);
            k=mx;
        }
    }

    public static void swim(int []ar, int k,int m){
        while(k>1 && ar[k]> ar[k/2]){
            swap(ar,k,k/2);
            k/=2;
        }
    }

    public static void swap(int[]ar, int k, int m){
        int temp = ar[k];
        ar[k]=ar[m];
        ar[m]= temp;
    }

    public static void print(int[] ar){
        System.out.print("Array: ");
        for(int e: ar){
            System.out.print(e+",");
        }
        System.out.println("..");
    }













}
