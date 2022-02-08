package exceptions;

import java.util.Scanner;

public class TestOwn {

    public static void mekanControl2(int age) throws ExceptionIO {
        // checked exeptionlarda throws anahtar kelimesini eklemek gerek
        // mutlaka yakalanmalı

        if(age<18){
            String m= "18 yaşından küçükler mekana giremez";
            throw new ExceptionIO(m);
        }
        else {
            System.out.println("Hoşgeldiniz...");
        }

    }

    public static void mekanKontrol(int age){
        if(age<18){
            String m= "18 yaşından küçükler mekana giremez";
            throw new InvalidAgeException(m);
        }
        else {
            System.out.println("Hoşgeldiniz...");
        }
    }

    public static void main(String[] args) {
        Scanner su = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = su.nextInt();

        try { // bunu yapmazsak exception hatası olarak konsolda çıkıyor böyle mesaj olarak bastırıyoruz
            mekanKontrol(age);
        }
        catch (InvalidAgeException e){

            System.out.println(e); // böyle de mesaj olarak basılıyor
           // e.printStackTrace();

        }

        try {
            mekanControl2(age); // böyle yapmayıp psvm ye throws anahtar kelimesi de eklenebilir Apı lerde mesela
        }
        catch (ExceptionIO e){
            e.printStackTrace();
        }



    }
}
