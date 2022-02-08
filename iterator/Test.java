package iterator;

import java.util.*;

public class Test {
    // Listiterator list sınıflarında kullanılabiliyor sadece eksta add metodu var
    // iterator set queue da falan kullanılıyor
    // iteratorda previous metod yok sadece ileri gidebiliyoruz
    public static void main(String[] args) {
       // Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

      /*  set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Go");

       */

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Go");

     /*   Iterator<String> iterator = set.iterator();
        Iterator<String> iterator1= list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("***********************");
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
*/

        ListIterator<String> iterator = list.listIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("////////////////tersten basma//////////////");

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());

        }

        while (iterator.hasNext()){
            String value = iterator.next();

            if(value.equals("Go")){ // eğer gelecek olan value Go ise kaldırıyoruz
                iterator.remove();
            }
        }
        System.out.println("*****************");

        for(String s: list){ // for döngüsünde iterator vardır
            System.out.println(s);
        }


    }
}
