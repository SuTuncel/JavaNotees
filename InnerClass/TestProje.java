package InnerClass;

import java.util.Scanner;

public class TestProje {
    public static void main(String[] args) {
        Scanner su = new Scanner(System.in);
        System.out.println("Matematik ve Fizik problemleri programına hoşgeldiniz...");

        String islemler= "Daire alanı\n"+
                "Üçgen çevresi\n"+
                "İç çarpım\n "+
                "Çıkış 4";

        while (true) {
            System.out.println(islemler);
            System.out.println("İşlem seçiniz: ");
            int is = su.nextInt();

            if (is==4){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if(is==1){
                System.out.println("Yarıçap giriniz: ");
                int r = su.nextInt();
                Problem.Mat.daireAlan(r);

            }
            else if (is==2){
                System.out.println("Kenar giriniz: ");
                int k1 = su.nextInt();

                System.out.println("Kenar giriniz: ");
                int k2 = su.nextInt();

                System.out.println("Kenar giriniz: ");
                int k3 = su.nextInt();

                Problem.Mat.ucgenCev(k1,k2,k3);

            }
            else if (is==3){
                Vec v1 = new Vec("a");
                Vec v2 = new Vec("b");

                Problem.Fizik.icCarpım(v1,v2);


            }


        }

    }
}
