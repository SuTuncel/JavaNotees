package COMP2102_Project2_Part2;

public class Node<E> {
    E txtName;
    Node<E> next;

    Node(E txtName){
        this.txtName= txtName;
        next=null;
    }

    public String toString(){
        return " "+txtName;
    }
}
