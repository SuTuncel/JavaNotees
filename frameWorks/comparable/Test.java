package frameWorks.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class BuyuktenKucugeString implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {

        return -o1.compareTo(o2);
    }
}








public class Test {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("C#");

        list.add("Flutter");
        Collections.sort(list);// Alfabetik olarak sıraladı

        for(String s: list){
            System.out.println(s);
        }

        System.out.println("*****************************************************");

        Collections.sort(list, new BuyuktenKucugeString());
        // NEYE GÖRE nasıl sıralayacağını bu sınıf belirliyor

        for(String s: list){
            System.out.println(s);
        }
    }


}
