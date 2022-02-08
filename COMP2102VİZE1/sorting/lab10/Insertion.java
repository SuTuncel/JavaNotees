package COMP2102VİZE1.sorting.lab10;

public class Insertion {
    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w)< 0;
    }

    private static void swap(Comparable[]a, int i, int j){
        if(i==j){
            return;
        }
        Comparable t = a[i];
        a[i]= a[j];
        a[j]= t;
    }

    public static void insertionSort(Comparable []a ){
        int n = a.length;
        for ( int i=1; i<n; i++){
            for(int j =i; j>0; j--){
                if(less(a[j],a[j-1])){
                    swap(a,j,j-1);
                }else{
                    break;
                }
            }
        }
    }

    public static void print(Comparable[] a){
        System.out.println("Array: ");
        for(int i =0; i< a.length; i++){
            System.out.println(a[i].toString()+" ");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ece",101,3.0f);
        Student s2 = new Student("Kerem",201,2.5f);
        Student s3 = new Student("Aslı",124,1.8f);
        Student s4 = new Student("Ahmet",267,3.02f);
        Student[] students = {s1,s2,s3,s4};
        System.out.println("Before: ");
        print(students);
        insertionSort(students);
        System.out.println("\nAfter: ");
        print(students);

    }


}
