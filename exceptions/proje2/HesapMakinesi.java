package exceptions.proje2;

import java.util.InputMismatchException;
import java.util.Scanner;

class CarpmaException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Daha küçük sayılar girin");
    }
}

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner su = new Scanner(System.in);

        try {
            System.out.println("Sayı 1: ");
            int a = su.nextInt();
            System.out.println("Sayı 2: ");
            int b = su.nextInt();
            System.out.println("İşlem: ");
            int islem = su.nextInt();

            switch (islem) {
                case 1:
                    System.out.println("Toplama: " + (a + b));
                    break;
                case 2:
                    System.out.println("Çıkarma: " + (a - b));
                    break;
                case 3:
                    if(a>10000 && b>10000){
                        throw new CarpmaException();
                    }
                    else {
                        System.out.println("Çarpma: " + (a * b));
                    }
                    break;
                case 4:
                    System.out.println("Bölme: " + (a /b));
                    break;
                default:
                    System.out.println("Geçersiz işlem!");
            }
        }
        catch (ArithmeticException e){
            System.out.println("Bir sayı 0'a bölünemez");
        }
        catch (InputMismatchException e){
            System.out.println("Lütfen girdileri doğru formatta girin");
        } catch (CarpmaException e) {
            e.printStackTrace();
        }

    }
}
