package COMP2102VİZE1.priorityQueue.genericPQ;

public class GenericLinkedPriorityQueue <T>{
    int size;
    NodePriority<T> first;
    NodePriority<T> last;

    public  GenericLinkedPriorityQueue(int size){
        this.size=size;
        first=null;
        last=null;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public int getSize(){
        return size;
    }

    public void enqueue(T entry){
        NodePriority<T> newNode = new NodePriority<>(entry);

        if (isEmpty()){
            first=newNode;
            last=newNode;
        }
        else{
            last.next=newNode;
            last=newNode;
        }
        size++;

    }

    public void enqueueWithPriority(T entry, int priority) {
        NodePriority<T> newNode = new NodePriority<>(entry, priority);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            NodePriority<T> temp = first;
            while (temp != null) {
                if (temp.next.priority >= newNode.next.priority) {
                    temp = temp.next;
                } else {
                    break;
                }
            }

            if (temp == first) {
                newNode.next = temp;
                first = newNode;
            } else {
                newNode.next = temp.next;
                temp.next = newNode;
                if (temp == last) {
                    last = newNode;
                }
            }
        }
        size++;
    }

    public String maxPriorityNode(){
        NodePriority<T> maxPriority = first;
        NodePriority<T> temp = first.next;
        while (temp!=null){
            if (temp.priority> maxPriority.priority){
                maxPriority = temp;
            }
            temp=temp.next;
        }

        return "Item: "+ maxPriority.item+ " Priority: "+ maxPriority.priority;

    }

    public T dequeue(){
        if (isEmpty()){
            throw new java.util.NoSuchElementException("Stack underflow");
        }
        NodePriority<T> temp = first;
        first=first.next;
        temp.next=null;
        size--;
        return temp.item; // return the saved item
    }
}
