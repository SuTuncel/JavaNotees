package frameWorks;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
   /*
   * Değerleri Key ve Value olarak depolar her keye karşılık bir tane değer bulunur
   * Bir anahtar sadece bir kez varolabilir. Ancak değer birden fazla olabilir
   * Elementler hashset gibi ekleme sırasına göre sıralanmaz
   *
   * */

    // hashmap ekrana bastırma entry sete dönüştürmek gerekiyor
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap= new HashMap<>();
        hashMap.put(10,"Java");
        hashMap.put(30,"Python");
        hashMap.put(50,"Php");
        hashMap.put(20,"Php");
        hashMap.put(50,"Javascript"); // php yi silecek ve yerine yeni değeri yazacak

      /*  System.out.println(hashMap);
        System.out.println(hashMap.get(50)); // değeri gösterir
       */

        for(Map.Entry<Integer,String> entry: hashMap.entrySet()){
            System.out.println("Anahtar: " +entry.getKey()
            + "----> Değer: "+ entry.getValue());
        }

    }











}
