package LinkedLists;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedList3_1 { // eğer anlamazsa bir daha yaz!!!!

    public static void islem_goster(){
        String menu="0-İşlemleri göster\n"+
                "1-Sonraki şehre git\n"+
                "2-Önceki şehre git\n"+
                "3-Çıkış yap";

        System.out.println(menu);
    }

    public static void sehir_turla(LinkedList<String> a){
        ListIterator<String> iterator= a.listIterator();
        Scanner su = new Scanner(System.in);
        int islem;
        islem_goster();

        if(!iterator.hasNext()){
            System.out.println("Gidilecek şehir bulunmamaktadır");
        }

        boolean ileri =true;

        while (true){
            System.out.println("Bir işlem seçiniz: ");
            islem= su.nextInt();

            if (islem==0){
                islem_goster();
            }
            else if (islem==1){
                if(!ileri){ // bir önceki işlemde geri gidildiyse
                    if (iterator.hasNext()){
                        iterator.next();
                    }
                    ileri=true;
                }
                if(iterator.hasNext()){
                    System.out.println("Sonraki şehir: "+ iterator.next());
                }
                else{
                    System.out.println("Gidilecek şehir kalmadı.");
                }

            }
            else if (islem==2){
                if(ileri){ // bir önceki işlemde ileri gidildiyse
                    if (iterator.hasPrevious()){
                        iterator.previous();
                    }

                    ileri= false;
                }

                if(iterator.hasPrevious()){
                    System.out.println("Önceki şehir: "+iterator.previous());
                }
                else{
                    System.out.println("Turun başındasınız...");
                }

            }
            else if (islem==3){
                System.out.println("Çıkış yapılıyor...");
                break;
            }

        }

    }

    public static void main(String[] args) {
        LinkedList<String> sehirler= new LinkedList<>();
        sehirler.add("Konya");
        sehirler.add("Antalya");
        sehirler.add("Bursa");
        sehirler.add("İstanbul");

        sehir_turla(sehirler);
    }

}
