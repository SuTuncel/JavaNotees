package InnerClass;

import java.util.Scanner;

public class Inner1 { // static olmayan inner class

    public static void main(String[] args) {

    Matematik.Factorial factorial = new Matematik().new Factorial();
 // önce matematiği oluşturuyorum sonra matematiğin içindeki faktoriyeli oluşturuyorum
    Matematik.Asal asal = new Matematik().new Asal();
    Matematik.Alan alan= new Matematik().new Alan();
    Matematik.Alan.Daire daire = new Matematik().new Alan().new Daire();

        Scanner su = new Scanner(System.in);

        System.out.println("Bir tane sayı giriniz: ");

        int sayi = su.nextInt();

        if(asal.asalMi(sayi)){
            System.out.println("Bu sayı asaldır.");
        }
        else {
            System.out.println("Bu sayı asal değildir");
        }

        factorial.faktorial();

        daire.daireAlan(5);


}

}
