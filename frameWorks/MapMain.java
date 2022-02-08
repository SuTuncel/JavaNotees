package frameWorks;

import java.util.*;

public class MapMain {
    public static void mapYazdir(Map<Integer,String> map){
        map.put(10,"C++");
        map.put(20,"C");
        map.put(30,"Java");
        map.put(40,"Php");
        map.put(50,"Python");
        map.put(60,"Java");

      /*  for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("Anahtar: "+ entry.getKey()+
                    " Değer: "+ entry.getValue());
        }*/

      //  System.out.println(map.keySet()); // sadece keyleri bastırır

        // alternatif ekrana yazdırma

      /*  for (Integer key: map.keySet()){
            System.out.println("Key: "+ key+ " Value: "+ map.get(key));
        }*/

        // Sadece değerleri bastırma yöntemi
        Collection<String> values = map.values();
        for(String s: values){
            System.out.println("Value: "+ s);
        }



    }
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        Map<Integer,String> linkedhashmap= new LinkedHashMap<>(); // eklendiği sırada sıralar
        Map<Integer,String> treemap = new TreeMap<>(); // keye göre sıralar

        mapYazdir(hashMap);
        System.out.println("***********");
        mapYazdir(linkedhashmap);
        System.out.println("***********");
        mapYazdir(treemap);


    }
}
