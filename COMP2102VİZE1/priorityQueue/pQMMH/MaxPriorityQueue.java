package COMP2102VİZE1.priorityQueue.pQMMH;

public class MaxPriorityQueue {

    static int[] H= new int[50];
    static int size =-1;

    static void swap(int i , int j){
        int temp = H[i];
        H[i]=H[j];
        H[j]=temp;
    }

    static int parent(int i ){
        return (i-1)/2;
    }

    static int leftChild(int i){
        return ((2*i)+1);
    }

    static int rightChild(int i){
        return ((2*i)+2);
    }

    static void shiftUp(int i){
        while(i>0 && H[parent(i)]<H[i]){
            swap(parent(i),i);
            i= parent(i);
        }
    }

    static void shiftDown(int i){
        int maxIndex =i;

        int l =leftChild(i);
        if (l<=size && H[l]> H[maxIndex]){
            maxIndex=l;
        }

        int r = rightChild(i);

        if(r<=size && H[r]> H[maxIndex]){
            maxIndex=r;
        }

        if(i!=maxIndex){
            swap(i,maxIndex);
            shiftDown(maxIndex);
        }
    }

    static void insert(int p){
        size=size+1;
        H[size]=p;

        shiftUp(size);
    }

    static int extractMax(){
        int result =H[0];
        H[0]= H[size];
        size=size-1;
        shiftDown(0);
        return result;
    }

    static void changePriority(int i, int p){
        int oldp = H[i];
        H[i]=p;

        if(p> oldp){
            shiftUp(i);
        }else{
            shiftDown(i);
        }
    }

    static int getMax(){
        return H[0];
    }

    static void remove(int i){
        H[i]= getMax()+1;
        shiftUp(i);
        extractMax();
    }

    public static void main(String[] args) {
        insert(45);
        insert(20);
        insert(14);
        insert(12);
        insert(31);
        insert(6);
        insert(11);
        insert(13);
        insert(7);

        int i = 0;
        System.out.println("Priority queue: ");
        while(i<=size){
            System.out.print(H[i]+" ");
            i++;
        }
        System.out.println("\n");

        System.out.println("Node with maximum priority: "+ extractMax()+" \n");

        System.out.println("Priority queue after extracting maximum: ");

        int j =0;

        while(j<=size){
            System.out.print(H[j]+" ");
            j++;
        }

        System.out.println("\n");

        changePriority(2,49);
        System.out.println("Priority queue after priority change");

        int k =0;

        while(k<=size){
            System.out.print(H[k]+" ");
            k++;
        }

        remove(3);
        System.out.println("Priority queue after removing the element: ");
        int l =0;

        while(l<=size){
            System.out.print(H[l]+" ");
            l++;
        }

        System.out.println("\n\nMinimum element is "+findMinimumElement(H,size));
        System.out.println("\nMinimum element is " + findMinimumElement2(H,size) + "\n");
    }

    public static int findMinimumElement(int heap[], int n) {
        int minimumElement = heap[0];

        for (int i = 1; i < n; ++i) {
            minimumElement = Math.min(minimumElement, heap[i]);
        }

        return minimumElement;
    }
    // O(N) operation
    public static int findMinimumElement2(int[] heap, int n){
        int minimumElement = heap[n/2];

        for (int i=1+ n/2; i<n; ++i){
            minimumElement= Math.min(minimumElement,heap[i]);
        }
        return minimumElement;
    }
}
