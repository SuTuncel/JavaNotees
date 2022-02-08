package exceptions;

public class TestFin {
    // final blokları
    public static void main(String[] args) {

        try{
            String s ="Su";
            System.out.println(s.hashCode());
        }
        catch (NullPointerException e){
            System.out.println("Null referans hatası...");
        }
        finally { // mutlaka çalışan bir blok. Hatayı yakalamasak dahi çalışır program sonra exception verir
            System.out.println("Finally bloğu çalışıyor ");
            // dosya kapama veritabanı bağlantısı kesme gibi mutlaka yapılması gereken işlemlerde kullanılır
        }
    }
}
