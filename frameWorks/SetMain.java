package frameWorks;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
       /* Set<String> s;
        HashSet<String>h;
        generic sınıfı her element belli bir key'e göre depolanır
        bir element sadece bir defa depolanır
        elementler ekleme sırasına göre depolanmaz
       LinkedHashSet<String > lhs;
        bir elementi sadece bir defa depolar
         elementleri ekleme sırasına göre depolar
       TreeSet<String> ts;
        elementleri tree şekilde yerleştiriyor
        elementler alfabetik olarak sıralanıyor*/

     /*   Set<String> set1= new HashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> set3= new TreeSet<>();

        set1.add("Java");
        set1.add("Golan");
        set1.add("Kotlin");
        set1.add("Php");
        set1.add("C++");

        set2.add("Java");
        set2.add("Golan");
        set2.add("Kotlin");
        set2.add("Php");
        set2.add("C++");

        set3.add("Java");
        set3.add("Golan");
        set3.add("Kotlin");
        set3.add("Php");
        set3.add("C++");

      */

      /*  System.out.println("Hashset**********************");
        for(String s: set1){
            System.out.println(s);
        }

        System.out.println("LinkedHashset**********************");
        for(String s: set2){
            System.out.println(s);
        }

        System.out.println("Treeset**********************");
        for(String s: set3){
            System.out.println(s);
        }

*/
      /*  System.out.println(set1.contains("Kotlin")); // içinde olduğu için true değer döndürdü
        System.out.println(set1.contains("Go"));
        System.out.println(set1.isEmpty()); // boşsa true değer döndürür doluysa false değer döndürür

*/

        // Kesişim ve Fark kümesi bulma

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("Java");
        set1.add("Html");
        set1.add("Dart");
        set1.add("JavaScript");
        set1.add("Php");

        set2.add("Go");
        set2.add("Java");
        set2.add("Css");

        Set<String> fark = new HashSet<>(set2);
        System.out.println(fark.removeAll(set1));

        /* önce farkı oluşturduk içine set2 yi ekledik böylece set2 nin eemanlarına sahip oldu ve
        * remove all set1 yaparak set1 in elemanlarını çıkardık böylece farklı elemanlar kalacak  */

        System.out.println(fark);

        System.out.println("***********************");

        Set<String> kesisim = new HashSet<>(set2);
        System.out.println(kesisim.retainAll(set1));
        /* herhangi bir kesişim var mı ona bakıcak varsa true yoksa false */


        System.out.println(kesisim);

        // sıralı değerde treeset hızlı karışık değerde hashset hızlı

    }



}
