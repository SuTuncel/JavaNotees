package COMP2102VİZE1.queue;

import java.util.NoSuchElementException;

public class QueuewArray {
int size =10;
int[] queue= new int[size];
int front, rear;

public QueuewArray(){
    front=-1;
    rear=-1;
}

public boolean isFull(){
    return ( front==0 && rear==size-1);

}

public boolean isEmpty(){
    return front==-1;
}

public void enqueue(int element){
    if(isFull()){
        System.out.println("Queue is full");
    }
    else{
        if(front==-1){
            front=0;
        }
        rear++;
        queue[rear]= element;
        System.out.println("Insert: "+element);

    }
}
public int dequeue(){
    int element;
    if (isEmpty()){
        System.out.println("Queue is empty");
        return -1;
    }else {
        element = queue[front];
        queue[front]=-1;
        front++;


        if(front>=rear){
            front=-1;
            rear=-1;

        }else{
            rear++;
        }
        System.out.println(element+" is deleted");
        return element;
    }
}

public int peek(){
    if(isEmpty()){
        throw new NoSuchElementException();
    }
    return queue[front];
}

    public QueuewArray mergeQueue(QueuewArray q2) {
        int newSize = this.size + q2.size;
        QueuewArray merged = new QueuewArray();
        int item1, item2;
        while (merged.size != newSize) {

            if (!this.isEmpty() && !q2.isEmpty()) {
                item1 = this.queue[front];
                item2 = q2.queue[q2.front];
                if (item1 < item2) {
                    merged.enqueue(item1);
                    this.dequeue();
                } else {
                    merged.enqueue(item2);
                    q2.dequeue();
                }
            } else if (this.isEmpty()) {
                item2 = q2.queue[q2.front];
                merged.enqueue(item2);
                q2.dequeue();
            } else if (q2.isEmpty()) {
                item1 = this.queue[front];
                merged.enqueue(item1);
                this.dequeue();

            }

        }

        return merged;
    }

    public int getMax() {
       if (isEmpty()){
           System.out.println("Queue is empty");
       }
       int max = queue[0];

       for (int i =0; i<size; i++){
           if(queue[i]>max){
               max=queue[i];
           }
       }
       return max;

    }



    public void display(){

    if (isEmpty()){
        System.out.println("Queue is empty");
    }else{
        int i =front;

        while (i<size){
            System.out.print(queue[i]+" ");
            i++;
        }

    }
}
    public static void main(String[] args) {
    QueuewArray queue= new QueuewArray();

    for (int i=1; i<6;  i++){
        queue.enqueue(i);
    }
        queue.display();
        System.out.println();// yıldız alt satıra insin die koydum
        System.out.println("*********************");
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();

        System.out.println("*********************");
    queue.display();
    }
}
