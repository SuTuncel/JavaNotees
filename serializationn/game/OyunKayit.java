package serializationn.game;

import java.io.*;

public class OyunKayit {
    public static void oyunKaydet(Kart[][] kartlar){
        try(ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream("kayit.bin"))){
            System.out.println("Oyun kaydediliyor...");
            out.writeObject(kartlar);

        } catch (IOException e) {
            System.out.println("Dosya yazılırken hata oluştu");
        }

    }

    public static Kart[][] kayittanAl(){
        try(ObjectInputStream in = new ObjectInputStream( new FileInputStream("kayit.bin"))){
            Kart[][] cikti= (Kart[][]) in.readObject();
            return cikti;
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException e) {
            System.out.println("Dosya yazılırken bir hata oluştu");
        } catch (ClassNotFoundException e) {
            System.out.println("Sınıf bulunamadı");
        }
        return null;
    }
}
