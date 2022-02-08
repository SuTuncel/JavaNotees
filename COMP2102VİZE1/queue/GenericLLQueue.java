package COMP2102VİZE1.queue;

public class GenericLLQueue<E> {
    int size;
    GNode<E> first,last;

    GenericLLQueue(){
        first=last=null;
        size=0;
    }

  public boolean isEmpty(){
        return first==null;
    }

  public int size(){
        return size;
  }

  public void enqueue(E item){
        GNode<E> newNode = new GNode<>(item);
        if(isEmpty()){
            last=newNode;
            first=newNode;
        }else {
            last.next = newNode;
            last = newNode;
        }
        size++;
  }

  public E dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return null;
        }else {
            GNode<E> temp = first;
            first = first.next;
            temp.next=null;
            size--;

            return temp.data;
        }
  }

  public String toString(){
        String str ="";
        GNode<E> temp = first;
        while(temp!=null){
            str+=temp.data+" ";
            temp= temp.next;
        }
        return str;
  }
}

class GNode<E>{

    public E data;
    public GNode<E> next;

    public GNode(E data){
        this.data=data;
        next =null;
    }

    public String toString(){
        return data+" ";
    }


}
