package frameWorks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        ArrayList<Integer> arraylist = new ArrayList<>();
        // metodları ortak depolama yöntemleri farklı

        zamanHesapla("LinkedList",linkedlist);
        zamanHesapla("arraylist", arraylist);


    }

    public static void zamanHesapla(String veriTipi, List<Integer> list){
        //performans hesabı listin sonuna değer ekleme
        long baslangic;
        long bitis;
        baslangic=System.currentTimeMillis();
        for(int i =0; i<100000; i++){
            list.add(i);
        }
        bitis= System.currentTimeMillis();

        System.out.println(veriTipi+ " ekleme süresi: "+ (bitis-baslangic)+ " ms");
    }
}
