package serializationn.collects;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Write {
    public static void main(String[] args) {
        Ogrenci ogrenci= new Ogrenci("Su", 1234,"Lojistik");
        Ogrenci ogrenci1= new Ogrenci("Ayşe",2345,"Kimya");
        Ogrenci ogrenci2= new Ogrenci("Serap",3456,"Biyoloji");
        Ogrenci[] array={ogrenci,ogrenci1,ogrenci2};
        ArrayList<Ogrenci> list = new ArrayList<>(Arrays.asList(array)); // arrayin içindeki objeleri bu listeye atıyor
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))){

            out.writeObject(array);
            out.writeObject(list);

        } catch (FileNotFoundException e) {
            System.out.println("Dosya Bulunamadı");
        } catch (IOException e) {
            System.out.println("Dosya yazılırken bir hata oluştu");
        }
    }
}
