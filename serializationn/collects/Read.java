package serializationn.collects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Read {
    public static void main(String[] args) {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenciler.bin"))){
            Ogrenci[] array =(Ogrenci[]) in.readObject();
            ArrayList<Ogrenci> list= (ArrayList<Ogrenci>) in.readObject();

            for(Ogrenci o: array){
                System.out.println(o);
                System.out.println("----------------");
            }
            System.out.println("*******ArrayList***********");
            for(Ogrenci o: list){
                System.out.println(o);
                System.out.println("----------------");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException e) {
            System.out.println("Dosya okunurken hata oluştu");
        } catch (ClassNotFoundException e) {
            System.out.println("Sınıf bulunamadı");
        }
    }
}
