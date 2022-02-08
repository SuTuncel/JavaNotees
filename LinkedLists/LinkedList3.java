package LinkedLists;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedList3 {

    public static void islemleri_bastir(){

        String menu= """
                0-İşlemleri Görüntüle
                1-Bir sonraki şehre git
                2-Bir önceki şehre git
                3-Uygulamadan çık""";

        System.out.println(menu);

    }

    public static void sehirleri_turla(LinkedList<String> a){
        ListIterator<String> iterator = a.listIterator();

        int islem;

        islemleri_bastir();

        Scanner su = new Scanner(System.in);

        if(!iterator.hasNext()){
            System.out.println("Herhangi bir şehir bulunmamaktadır...");
        }
        boolean cikis= false;
        boolean ileri=true;

        while (!cikis){
            System.out.println("Bir işlem seçiniz");

            islem= su.nextInt();

            switch (islem){

                case 0 : islemleri_bastir();
                break;
                case 1 :
                    if (!ileri){ // daha önceki aşamada geri gittyise false böylece iteratör ileri atlayacak şehir iki kez gösterilmeeyecek
                        if (iterator.hasNext()){ // ilk 2 ye basıldığında şehir turu başladı der ve sonra 1e basıldığında ankara atlanır ve direkt eskişehire gidilir

                            iterator.next();
                        }
                        ileri=true;

                    }
                    if (iterator.hasNext()){
                        System.out.println("Şehre gidiliyor..."+ iterator.next());
                    }
                    else {
                        System.out.println("Gidilecek şehir kalmadı.");
                        ileri=true;
                    }

                    break;
                case 2:
                    if (ileri){ // daha önceki aşamada ileri gittiyse true böylece iteratör geri gidecek  şehir iki kez gösterilmeyecek
                        if (iterator.hasPrevious()){ // ankara eskişehir (eskişehir) ankara olur iki kez eskişehir çıkmasını önler
                           iterator.previous();
                        }
                        ileri=false;
                    }
                    if (iterator.hasPrevious()){
                        System.out.println("Şehre gidiliyor..."+iterator.previous());
                    }
                    else{
                        System.out.println("Şehir turu başladı...");
                    }

                    break;
                case 3:
                    cikis=true;
                    System.out.println("Bye Bye...");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<String> sehirler = new LinkedList<>();

        sehirler.add("Ankara");
        sehirler.add("Eskişehir");
        sehirler.add("Afyon");

        sehirleri_turla(sehirler);

    }

}
