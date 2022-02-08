package LinkedLists;

import java.util.ArrayList;

public class LinkedList1 {

    public static void main(String[] args) {

        ArrayList<String> diller = new ArrayList<>();

        diller.add("Java");
        diller.add("Php");
        diller.add("C++");
        diller.add("Javascript");
        diller.add("Python");
        diller.add("Kotlin");

        int i=0;

        while (i< diller.size()){

            System.out.println(diller.get(i));

            i++;
        }

        System.out.println("------------");

        diller.add(1,"C#");

        for (String s: diller){
            System.out.println(s);
        }





    }

}
