package Autoboxing;

import java.util.ArrayList;

public class One1 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        // Autoboxing ve Unboxing, Integer--> Wrapper class

        for (int i=0; i<10; i++){
            arrayList1.add(Integer.valueOf(i*4)); // autoboxing ilkel bir veriyi referans olan sınıfına gönderdik
        // Javanın burada sorun var demesinin nedeni bunu kendisi dönüştürüyor zaten
            // senin yapmana gerek yok analmında i*4 olarak yazsan java sorun çıkarmaz
        }

        for(int i=0; i< arrayList1.size(); i++){
            System.out.println(arrayList1.get(i).intValue()); // unboxing Integer olanı inte döndürüyooruz
         // .get(i) yazsan Java sorun çıkarmaz
        }









    }
}
