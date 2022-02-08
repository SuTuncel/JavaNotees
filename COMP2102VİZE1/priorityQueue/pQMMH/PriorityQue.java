package COMP2102VİZE1.priorityQueue.pQMMH;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(); // default olarak minHeap
        // Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); bu şekilde maxHeape dönüşüyor

        pq.add(5); // O(logN) time complexity
        pq.add(15);
        pq.add(25);
        pq.add(10);
        pq.add(1);

        System.out.println("Size: "+ pq.size()+ "\n");
        int m = pq.size();

        System.out.println(pq.contains(25)); // O(N)

        System.out.println("Integer Queue: \n");
        for (int i =0; i<m; i++){
            System.out.println(pq.poll()); // O(logN)
        }

        // heap sort time complexity is O(NlogN)

        System.out.println("/*/*/*/*/*/*/*//*/*/*/*/*/*/*/*/*/");

        PriorityQueue<Student> pq2 = new PriorityQueue<>();
        pq2.add(new Student("Ece", 234,3.00f));
        pq2.add(new Student("Murat", 235,2.34f));
        pq2.add(new Student("Ayşin", 236,1.96f));
        pq2.add(new Student("Cem", 237,2.67f));
        System.out.println("\nStudent Queue\n");
        int n = pq2.size();
        for(int i =0; i<n; i++){
            System.out.println(pq2.remove());
        }

    }
}

class Student implements Comparable<Student>{
    float gpa;
    int idNo;
    String name;

    public Student (String name, int idNo, float gpa){
        this.name= name;
        this.idNo= idNo;
        this.gpa= gpa;
    }

    public int compareTo(Student a){
        if (this.gpa- ((Student) a).gpa >0){
            return 1;
        }
        else if (this.gpa- ((Student)a).gpa<0){
            return -1;
        }else{
            return 0;
        }
    }

    public String toString(){
        return "Student: "+name+", id Number: "+idNo+", gpa: "+gpa+"\n";
     }
}
