package frameWorks;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain { // Arraylist tekrar gibi

    public static void main(String[] args) {
       // ArrayList<String > arrayList = new ArrayList<>();

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Golan");
        list.add("C++");

        for(String s: list){ // for( int i =0; i< list.size(); i++)
            System.out.println(s);
        }


    }
}
