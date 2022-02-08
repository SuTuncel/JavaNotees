package COMP2102_Project2_Part2;

public class LinkedList<E> {
 Node<E> first;
 Node<E> last;
 int size;

 public LinkedList(){
     first=null;
     last=null;
     size=0;
 }

 public void  insertLast(E txtName){
     Node<E> newNode = new Node<>(txtName);
     if(first==null){
         first=newNode;
         last=newNode;
     }
     else{
         last.next=newNode;
         last=newNode;
     }
     size++;
 }

 public String toString(){
     Node temp = first;
     String str = " ";
     while(temp!=null){
         str+=temp.txtName+", ";
         temp=temp.next;
     }
     return str+"("+size+")";
 }

}
