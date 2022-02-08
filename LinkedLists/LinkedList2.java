package LinkedLists;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList2 {

    public static void bastir(LinkedList<String> a){
       /* for(String s: a){
            System.out.println(s);
        }*/

        ListIterator<String> iterator = a.listIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public static void sirali_ekle(LinkedList<String> a,String yeni){
        ListIterator<String> iterator = a.listIterator();

        while(iterator.hasNext()){
            int karsilastir= iterator.next().compareTo(yeni); // değer eşitse 0, yeni büyükse -1, yeni küçükse 1;
            //baş harflerini karşılaştırıyor M P'den küçük yani yeni küçük o zaman karsilastir 0 dan büyük

            if(karsilastir==0){
                System.out.println("Listenizde bu eleman bulunuyor");

                return;
            }

            else if(karsilastir<0){
                // yeni değer iterator.nextdan daha büyük
                // burada tüm objelere sırayla bakılıyor
            }

            else if (karsilastir>0){

                iterator.previous();
                iterator.add(yeni);

                return;
            }

        }

        iterator.add(yeni);


    }



    public static void main(String[] args) {

        LinkedList<String> gidilecekYerler = new LinkedList<>();

        sirali_ekle(gidilecekYerler,"Postane");
        sirali_ekle(gidilecekYerler,"Market");
        sirali_ekle(gidilecekYerler,"Ev");
        sirali_ekle(gidilecekYerler,"Züccaciye");
        sirali_ekle(gidilecekYerler,"Yataş");
        sirali_ekle(gidilecekYerler, "Pastane");

        bastir(gidilecekYerler);

       /* gidilecekYerler.add("Postane");
        gidilecekYerler.add("Okul");
        gidilecekYerler.add("Kütüphane");
        gidilecekYerler.add("Belediye");
        gidilecekYerler.add("Market");
        gidilecekYerler.add("Spor Salonu");

        bastir(gidilecekYerler);

        System.out.println("---------------------");

        gidilecekYerler.add(4,"Alışveriş Merkezi");

        bastir(gidilecekYerler);

        System.out.println("---------------");

        gidilecekYerler.remove(2);

        bastir(gidilecekYerler);

        */




    }
}
