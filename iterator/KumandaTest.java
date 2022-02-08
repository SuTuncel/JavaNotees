package iterator;

import java.util.Scanner;

public class KumandaTest {

    public static void main(String[] args) throws InterruptedException {
        String [] array = {"Fox", "Show", "Star", "Ahaber"};
        Kumanda kumanda= new Kumanda(array);
        System.out.println("Kumanda programına hoşgeldiniz");
        Scanner su = new Scanner(System.in);

        String islem = "1.Kanal ekle\n"+
                "2.Kanal sil\n"+
                "3.Kanal göster\n"+
                "4.Kanal sayısı\n"+
                "Çıkış q";

        System.out.println(islem);

        while (true){
            System.out.print("İslem giriniz: ");
            String isl = su.nextLine();

            if (isl.equals("q")){
                System.out.println("Bye bye...");
                break;
            }
            else if (isl.equals("1")){
                System.out.print("Kanal ad: ");
                String knl = su.nextLine();
                kumanda.kanalEkle(knl);
                Thread.sleep(1000);
                System.out.println("Kanal eklendi.");
            }
            else if (isl.equals("2")){
                System.out.print("Silinecek Kanal ad: ");
                String knl = su.nextLine();
                kumanda.kanalSil(knl);

            }
            else if ( isl.equals("3")){
                System.out.println("Kanallar: ");
                int i=1;
                for(String s: kumanda){
                    System.out.println(i+ ". Kanal: "+s);
                    i++;
                }
            }
            else if (isl.equals("4")){
                System.out.println("Toplam kanal sayısı: "+ kumanda.kanalSayisi());
            }
        }

    }
}
