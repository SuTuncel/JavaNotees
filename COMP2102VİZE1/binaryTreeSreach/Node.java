package COMP2102VİZE1.binaryTreeSreach;

public class Node <E>{
    int key;
    E data;
    Node<E>left,right;

    public Node(int key, E data) {
        this.key=key;
        this.data=data;
    }

    public String toString(){
        return " "+", "+key+" ";
    }


}
