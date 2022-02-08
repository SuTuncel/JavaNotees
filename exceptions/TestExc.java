package exceptions;

public class TestExc {
    public static void main(String[] args) {

       // int a = 30/0; // unchecked exceptions

     /*   try{
            int [] array = {1,2,34,5,6};
            System.out.println(array[9]);
        }
        catch (Exception e){ //Exception sınıfı superclass

        e.printStackTrace(); // mesajı direkt bastırıyor
        }

        System.out.println("Burası çalışıyor ");

*/

        try{
            int [] array = {1,2,34,5,6};
            System.out.println(array[0]);
            System.out.println(array[9]);
            int a = 30/0;

        }
        catch (ArithmeticException e){
            System.out.println("Bir sayı 0'a bölünemez");
        }
        catch (ArrayIndexOutOfBoundsException e){ // ilk bu çalışıyor çünkü ilk bu exceptionu yakalıyor
            System.out.println("Array'in boyunu aştınız");
        }
        catch (Exception e){
            System.out.println("Bir hata oluştu..");

        }
        System.out.println("Burası çalışıyor ");
    }




}
