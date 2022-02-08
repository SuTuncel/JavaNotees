package COMP2102VİZE1.queue;

public class PriorityQueue<E> {
    int size;
    PNode<E> first, last;

    public PriorityQueue(){
        first=last=null;
        size=0;
    }

    boolean isEmpty(){
        return first==null;
    }

    int size(){
        return size;
    }

    public void enqueue(E data, int priority){
        PNode<E> newNode= new PNode<>(data,priority);
        if(isEmpty()){
            first=last=newNode;
        }else{
            last.next=newNode;
            last=newNode;
        }
        size++;
    }

    public void enqueueWPriority(E data, int priority){
        PNode<E> newNode= new PNode<>(data,priority);
        if(isEmpty()){
            first=last=newNode;
        }else{
            PNode<E> temp = first;
            while(temp.next!=null){
                if(temp.next.priority>newNode.priority){
                    temp=temp.next;
                }else{
                    break;
                }
            }
            if(temp==first){
                newNode.next=temp;
                first=newNode;
            }else{
                newNode.next=temp.next;
                temp.next=newNode;
                if(temp==last){
                    last=newNode;
                }
            }
        }
        size++;
    }

   public String maxPriorityNode(){
        PNode<E> max= first;
        PNode<E> temp = first.next;

        while(temp!=null){
            if(temp.priority> max.priority) {
                max = temp;
            }
                temp=temp.next;
        }
       return "Max: "+ max;
    }

   public E dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
            PNode<E> temp=first;
            first=first.next;
            temp.next=null;
            size--;
            return temp.data;
    }

   public String toString(){
        String s=" ";
        PNode<E> temp =first;
        while(temp!=null){
            s+=temp.data+" ";
            temp=temp.next;
        }
        return s;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> queue= new PriorityQueue<>();
        queue.enqueueWPriority(1,7);
        queue.enqueueWPriority(2,6);
        queue.enqueueWPriority(3,8);
        queue.enqueueWPriority(4,9);


        System.out.println(queue.toString());




    }
}

class PNode<E>{
    public E data;
    public int priority;
    public PNode<E> next;

    PNode(E data){
        this.data=data;
        priority=0;
        next=null;
    }

    public PNode(E data, int priority) {
        this.data = data;
        this.priority = priority;
        next=null;
    }


    public E getData() {
        return data;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
