package serializationn;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {
    public static void main(String[] args) {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))) { // bin yerine dat ve ser de olurmuş

            Ogrenci ogrenci= new Ogrenci("Elif Su", 1234,"Yazılım Mühendisliği");
            Ogrenci ogrenci2= new Ogrenci("Su", 6789,"Elektrik Mühendisliği");
            out.writeObject(ogrenci);
            out.writeObject(ogrenci2);


        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException e) {
            System.out.println("Dosya yazılırken hata oluştu ");
        }
    }
}
