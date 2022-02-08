package COMP2102VİZE1.hashTables.separateChain;
public class Node<Item>{

    Item data;
    Node next;

    public Node(Item data) {
        this.data = data;
        next = null;
    }

    public String toString(){
        return (""+data.toString());
    }
}