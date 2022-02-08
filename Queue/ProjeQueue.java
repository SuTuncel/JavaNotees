package Queue;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProjeQueue {
    //Ramazan pidesi kuyruğu

    public static void main(String[] args) throws InterruptedException {
        Random rnd = new Random();
        System.out.println("Ramazan pidesi uygulaması...");

        Queue<String> pideK = new LinkedList<>();

        pideK.offer("Ahmet");
        pideK.offer("Büşra");
        pideK.offer("Buse");
        pideK.offer("Gürkan");
        pideK.offer("Zehra");
        pideK.offer("Mehmet");
        pideK.offer("Hasan");
        pideK.offer("Okan");
        pideK.offer("Özge");
        pideK.offer("Osman");

        int pideS = rnd.nextInt(10)+1; // 1 ile 11 11 dahil değil sayı üretir

        System.out.println("Pideler çıkıyor...");

        System.out.println("Çıkan pide sayısı: "+ pideS);

        Thread.sleep(3000); // 3 saniye bekleyen uygulama

        while(pideS!=0){
            System.out.println(pideK.poll()+ " pideyi aldı");
            pideS--; //  pide sayısını aldıktan sonra azaltıyoruz
            Thread.sleep(1000); // birisi pideyi aldıktan sonra bir sn bekliyor

        }

        System.out.println("Pide kalmadı.");

    }




}
