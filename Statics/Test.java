package Statics;

public class Test {

    public static void main(String[] args) {

        Seyirci s1 = new Seyirci("Ahmet");
        Seyirci s2= new Seyirci("Mehmet");

        s1.oyunSeyret();

        System.out.println("Seyirci sayısı: "+ Seyirci.seyircinum);
    }
}
