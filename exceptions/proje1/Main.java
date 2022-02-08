package exceptions.proje1;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Su havalimanına hoşgeldiniz...");
        String sartlar = "Yurtdışı çıkış kuralları...:\n "+
                "Siyasi yasağınız olmamalı\n"+
                "Harcı tam yatırmalısınız\n"+
                "Gidilecek ülkeye vizeniz bulunmalı";
        System.out.println("Not: Şartların hepsiniz sağlamanız gerekiyor\n "+
                ""+ sartlar);
        String msg= "Not: Şartların hepsiniz sağlamanız gerekiyor";

        while (true){
            System.out.println("***"+sartlar+"+++");

            Yolcu yolcu = new Yolcu();

            System.out.println("Harç bedeli kontrol ediliyor");
            Thread.sleep(2000);

            try {
                yolcu.yurtdisiHarciKontrol();
            } catch (HarcException e) {
                e.printStackTrace();
                System.out.println(msg);
                continue;
            }

            System.out.println("Siyasi yasak kontrol ediliyor");
            Thread.sleep(2000);
            try {
                yolcu.siyasiYasakKontrol();
            } catch (SiyasiException e) {
                e.printStackTrace();
                System.out.println(msg);
                continue;
            }
            System.out.println("Vize kontrol ediliyor");
            Thread.sleep(2000);

            try {
                yolcu.vizeDurumuKontrol();
            } catch (VizeException e) {
                e.printStackTrace();
                System.out.println(msg);
                continue;
            }

            System.out.println("Eylemler tamam. İyi yolculuklar...");
            break;

        }

    }

}
