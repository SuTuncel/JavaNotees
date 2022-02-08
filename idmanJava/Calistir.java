package idmanJava;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Calistir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İdman Programına hoşgeldiniz...");
        System.out.println("*************************************");
        String idmanlar = "Geçerli Hareketler...\n" +
                "Purpee\n" +
                "Pushup\n" +
                "Situp\n" +
                "Spuat\n";
        System.out.println(idmanlar);
        System.out.println("*************************************");
        System.out.println("Bir idman oluşturun...");
        System.out.print("Burpee sayısı: ");
        int burpee = input.nextInt();
        System.out.println("Pusup sayısı: ");
        int pushup = input.nextInt();
        System.out.println("Situp sayısı: ");
        int situp = input.nextInt();
        System.out.println("Squat sayısı: ");
        int squat = input.nextInt();
        input.nextLine();// almazsak program görmüyor!!

        Idman idman = new Idman(burpee, pushup, situp, squat);
        System.out.println("İdmanınız başlıyor...");
        int i = 1;

        try (FileWriter writer = new FileWriter("log.txt")) {
            writer.write("Idman Porgramı\n");
            writer.write("Burpee Sayısı: "+idman.getBurpeesayisi()+"\n");
            writer.write("Pushup Sayısı: "+idman.getPushupsayisi()+"\n");
            writer.write("Situp sayısı: "+idman.getSitupsayisi()+"\n");
            writer.write("Squat Sayısı: "+idman.getSquatsayisi()+"\n");


        while (idman.idmanbittimi() == false) {

            System.out.println("Hareket türü: ");
            String tur = input.nextLine();
            System.out.println("İdman sayısı: ");
            int sayi = input.nextInt();
            input.nextLine();
            idman.hareketYap(tur, sayi);

            writer.write(i+". işlem--------> Hareket: "+ tur+ " sayı: "+sayi+"\n");
            i++;
        }

    } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
