package Generics.Proje;

import java.util.Scanner;

public class Test {

    public static <E extends Aday> E birinci(E e1, E e2, E e3){

        if(e1.puanHesapla()> e2.puanHesapla() && e1.puanHesapla()> e3.puanHesapla()){
            return e1;
        }
        else if (e2.puanHesapla()> e1.puanHesapla() && e2.puanHesapla()> e2.puanHesapla()){
            return e2;
        }
        else {
            return e3;
        }

    }

    public static void main(String[] args) {
        System.out.println("YGS & LYS birinci bulma");
        Scanner su = new Scanner(System.in);

        String islem= "1-Sayısal birincisi hesapla\n"+
                "2-Sözel birincisi hesapla\n"+
                "Çıkış q ";

        System.out.println("Birinci öğrenci ismi : ");
        String isim1 = su.nextLine();
        System.out.println("Netler (Turkçe, Matematik ,Fen ,Sosyal)");
        int t1= su.nextInt();
        int m1 = su.nextInt();
        int f1= su.nextInt();
        int s1 = su.nextInt();
        su.nextLine();

        System.out.println("İkinci öğrenci ismi : ");
        String isim2 = su.nextLine();
        System.out.println("Netler (Turkçe, Matematik ,Fen ,Sosyal)");
        int t2= su.nextInt();
        int m2 = su.nextInt();
        int f2= su.nextInt();
        int s2 = su.nextInt();
        su.nextLine();

        System.out.println("Üçüncü  öğrenci ismi : ");
        String isim3 = su.nextLine();
        System.out.println("Netler (Turkçe, Matematik ,Fen ,Sosyal)");
        int t3= su.nextInt();
        int m3 = su.nextInt();
        int f3= su.nextInt();
        int s3 = su.nextInt();
        su.nextLine();


        while(true){
            System.out.println("************");
            System.out.println(islem);

            System.out.print("Bir işlem seçiniz: ");
            String is = su.nextLine();

            if(is.equals("q")){
                System.out.println("Uygulamadan çıkılıyor...");
                break;
            }
            else if (is.equals("1")){
                Sayisal o1 = new Sayisal(isim1,t1,m1,f1,s1);
                Sayisal o2 = new Sayisal(isim2,t2,m2,f2,s2);
                Sayisal o3 = new Sayisal(isim3,t3,m3,f3,s3);

                Sayisal bir = birinci(o1,o2,o3);

                System.out.println(" Sayısal Birinci: "+ bir.toString());
                System.out.println(o1.toString());
                System.out.println(o2.toString());
                System.out.println(o3.toString());


            }
            else if (is.equals("2")){

                Sozel o1 = new Sozel(isim1,t1,m1,f1,s1);
                Sozel o2 = new Sozel(isim2,t2,m2,f2,s2);
                Sozel o3 = new Sozel(isim3,t3,m3,f3,s3);

                Sozel bir = birinci(o1,o2,o3);

                System.out.println("Sözel Birinci: "+ bir.toString());
                System.out.println(o1.toString());
                System.out.println(o2.toString());
                System.out.println(o3.toString());

            }
            else {
                System.out.println("Geçersiz işlem...");
            }


        }

    }


}
