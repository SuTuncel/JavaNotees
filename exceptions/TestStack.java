package exceptions;

public class TestStack { // exception propagation

    public static void ucuncu(){
            int a = 12 / 0;
    }

    public static void ikinci(){
        try { // bu şekilde yakalama yapılabilir
            ucuncu();
        } catch (ArithmeticException e){
            System.out.println("Bir sayı 0'a bölünemez");
        }

    }

    public static void birinci(){
        ikinci();
    }

    public static void main(String[] args) {

        birinci();
        System.out.println("Müq");

    }
}
