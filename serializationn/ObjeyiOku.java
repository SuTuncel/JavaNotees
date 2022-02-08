package serializationn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjeyiOku {
    public static void main(String[] args) {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))) {
            Ogrenci ogrenci= (Ogrenci) in.readObject(); // tür dönüşümü yapmazsak eğer hata verir
            Ogrenci ogrenci2= (Ogrenci) in.readObject();

            System.out.println("*************");
            System.out.println(ogrenci);
            System.out.println("*************");
            System.out.println(ogrenci2);


        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException e) {
            System.out.println("Dosya yazılırken hata oluştu");
        } catch (ClassNotFoundException e) {
            System.out.println("Böyle bir sınıf bulunamadı ");
        }

    }
}
