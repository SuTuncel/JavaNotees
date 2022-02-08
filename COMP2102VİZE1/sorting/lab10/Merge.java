package COMP2102VİZE1.sorting.lab10;

public class Merge {
    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w)<0;
    }

    public static void mergeSort(Comparable[] a){
        Comparable[] aux = new Comparable[a.length];
        mergeSort(a,aux,0,a.length-1);
    }

    public static void mergeSort(Comparable[] a, Comparable[] aux, int low, int high){
        System.out.println(low+ "-"+ high);
        if(high<=low){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(a,aux,low,mid); // first merge sol taraf kısmı işte
        mergeSort(a,aux,mid+1,high); // second merge sağ taraf kısmı
        merge(a,aux,low,mid,high); // iki yeni merge birleştirme kısmı
    }

    private static void merge(Comparable[] a, Comparable[] aux, int low, int mid, int high){
        System.arraycopy(a,0,aux,0,a.length);
        int j = low;
        int k = mid+1;

        for (int i =low; i<=high; i++){
            if(j<=mid && k<=high){
                if(less(aux[j],aux[k])){
                    a[i]=aux[j++];// sol kısmı
                }else{
                    a[i]= aux[k++]; // sağ kısmı
                }
            }else if(j<=mid) { // this means k> high
                a[i]= aux[j++];
            }
            else if (k<=high){ // this means j> mid
                a[i]= aux[k++];
            }
        }
    }

    public static void print(Comparable[]a ){
        for(int i =0; i<a.length; i++){
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
        mergeSort(students);
        System.out.println("\nAfter: ");
        print(students);


    }



}
