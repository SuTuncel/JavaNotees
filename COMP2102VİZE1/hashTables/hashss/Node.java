package COMP2102VİZE1.hashTables.hashss;

public class Node<Item> {
    Item data;
    Node next;

    public Node(Item data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}