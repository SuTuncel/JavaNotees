package COMP2102VİZE1.stacks;

import java.util.Locale;
import java.util.Scanner;

public class GenericLLStack <E>{
    public int N; // size of Stack
    Node<E> first;

    public GenericLLStack(){
        N=0;
        first=null;
    }

    public int size(){
        return N;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void push (E data){
    Node<E> oldfirst= first;
    first= new Node<E>(data);
    first.next= oldfirst;
    N++;
    }

    public E pop(){
        if(isEmpty())
            System.out.println("No elements in here ");

        E data = first.data;
        first=first.next;
        N--;
        return data;
    }

    public String toString(){
        StringBuilder str = new StringBuilder("List with "+N+ " elements");
        if(isEmpty()){
            return str.append("None").toString();

        }
        Node<E> temp= first;
        while(temp!=null){
            str.append(temp.data+"-->");
            temp=temp.next;
        }

       return str.toString();

    }
}

 class Node<E> {
     E data;
     Node<E> next;

     Node(E data) {
         this.data = data;
         next = null;
     }

     public String toString() {

         return "Node: " + data;
     }

     public static void main(String[] args) {
        /*GenericLLStack<String> genericLLStack= new GenericLLStack<>();
         genericLLStack.push("hmm");
         genericLLStack.push("demek");
         genericLLStack.push("cimcimemizin");
         genericLLStack.push("heyheyleri");
         genericLLStack.push("üstünde");
         genericLLStack.push(":)");
         System.out.println(genericLLStack.toString());
         genericLLStack.pop();
         genericLLStack.pop();
         genericLLStack.pop();
         System.out.println(genericLLStack.toString());
         genericLLStack.push("uykucu");
         System.out.println(genericLLStack.toString());*/
        /* Scanner su = new Scanner(System.in);
         System.out.print("Please enter a text: ");
         String userString = su.next();
         StringBuilder text = new StringBuilder(userString.toLowerCase());

         if (text.toString().equals("")) {
             throw new IllegalArgumentException();
         } else {
             GenericStack<Character> Stack = new GenericStack<>();
             for (int i = 0; i < text.length(); i++) {
                 Stack.push(text.charAt(i));
             }

             String reverse = "";

             while (!Stack.isEmpty()) {
                 reverse = reverse + Stack.pop();
             }
             System.out.println("Original text: " + text);
             System.out.println("Reverse text: " + reverse);

             if (text.toString().equals(reverse)) {
                 System.out.println("String is a palindrome");
             } else {
                 System.out.println("String is not a palindrome ");
             }
         }*/

         Scanner su = new Scanner(System.in);
         System.out.println("Enter text: ");
         String userText= su.next();
         StringBuilder text = new StringBuilder(userText.toLowerCase());

         if (text.toString().equals("")){
             throw new IllegalArgumentException();
         }else{
             GenericLLStack<Character> stack = new GenericLLStack<>();
             for(int i=0; i<text.length(); i++){
                 stack.push(text.charAt(i));
             }
             String reverse="";
             while (!stack.isEmpty()){
                 reverse=reverse+ stack.pop();
             }
             System.out.println("Text: "+text);
             System.out.println("Reverse text: "+reverse);

             if(text.toString().equals(reverse)){
                 System.out.println("Text is palindrome");
             }else{
                 System.out.println("Text is not palindrome ");
             }

         }
     }
 }
