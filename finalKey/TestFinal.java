package finalKey;

class TestFinal {
    public final int obje_sayisi;
    private static int say=0;
    private final String isim;
    // ya tanımlanırken ya da constructor içinde değeri verilmeli
    // final değerler'in set metodu yok

   public TestFinal(String isim){
       this.isim=isim;
       say++;
       obje_sayisi=say;

    }


}
  class Main{
    public static void main(String[] args) {

        TestFinal fi = new TestFinal("Obje1");
        TestFinal fi2 = new TestFinal("Obje2");

        System.out.println("f1: "+fi.obje_sayisi);
        System.out.println("f2: "+fi2.obje_sayisi);
        System.out.println("*********************************");
        System.out.println(Math.PI);
        System.out.println("*******************************");

     /*   System.out.println(Database.database_Name);
        System.out.println(Database.user_Name);
        System.out.println(Database.password);*/

        Database data = new Database();
        data.baglantiKur("root","12345");




    }
}
