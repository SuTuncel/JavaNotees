package COMP2102VİZE1.queue;

public class LLQueue {
    QNode front;
    QNode rear;
    int size;

    LLQueue(){
        front=null;
        rear=null;
        size=0;
    }
    public boolean isEmpty(){
        return front==null;
    }

    public void enqueue(int key){
        QNode newNode = new QNode(key);

        if (this.rear==null){// queue boş ise bunu yapıyoruz
            front=newNode;
            rear=newNode;
            size++;


        }
        rear.next=newNode;
        rear=newNode;
        size++;
    }


    public int dequeue(){
        if(front==null){
            return -1;
        }
        QNode temp = front;
        front=front.next;
        size--;

        return temp.key;

    }

    public String toString(){
        String str ="";
        QNode temp =front;
        while(temp!=null){
            str+=temp.key+" ";
            temp=temp.next;
        }
        return str;
    }

    public static void main(String[] args) {
        LLQueue queue= new LLQueue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        System.out.println("Çıkan: "+queue.dequeue());
        System.out.println("Çıkan: "+queue.dequeue());
        System.out.println("Çıkan: "+queue.dequeue());
        System.out.println(queue.toString());





    }
}
class QNode{
    int key;
    QNode next;

  public QNode(int key){
       this.key=key;
       next=null;
    }

}