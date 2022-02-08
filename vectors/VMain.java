package vectors;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class VMain {
    public static void main(String[] args) {
        /*
        // threadlerde çok güvenli ama arraylistlere göre daha yavaştır

        Vector<String> vector= new Vector<>();
        vector.add("Java");
        vector.add("Php");
        vector.add("Javascript");
        vector.add("Python");

        for(String s: vector){
            System.out.println(s);
        }

        System.out.println("// iterator kullanarak listede gezinmek");

        ListIterator<String> iterator = vector.listIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("// enumeration(numaralandırma) kullanarak" +
                " listede gezinmek");

        Enumeration<String> enumeration= vector.elements();
        // iterator ile aynı mantıkta çalışır

        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        System.out.println("İlk eleman: "+ vector.firstElement());
        System.out.println("Son eleman: "+ vector.lastElement());

        */
        Stack<String> stack = new Stack<>();

        stack.push("Python");
        stack.push("Java");
        stack.push("Php");
        stack.push("Go");

        for(String s: stack){
            System.out.println(s);
        }

        System.out.println("///////Enumerationla///////////////");

        Enumeration<String> enumeration= stack.elements();

        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        System.out.println("///////////////////////////");
        //Last in first out

        System.out.println(stack.peek()); // son giren elemanı al

        System.out.println("Son eleman çıkarılıyor: "+ stack.pop());

        for(String s: stack){
            System.out.println(s);
        }

       // System.out.println(stack.empty()); // boşsa true doluysa false


        // son eklenene göre eleman çıkarma
        while (!stack.empty()){
            System.out.println("Eleman çıkarılır...: "+ stack.pop());
        }

    }
}
