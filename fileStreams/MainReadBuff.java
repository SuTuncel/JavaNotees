package fileStreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
 // yeniden yaz
public class MainReadBuff { // fileReader ve buffedReader
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("öğrenciler.txt")))) {
 // Scanner a koyduk ve konsoldan değil direkt txt dosyasının içinden almış olduk böylece son satıra kadar okur zorluk çıkmaz
            while (scanner.hasNextLine()){ // scanner.nextLine() ile tüm öğrencileri bastırabilirsin
                String ogrenciBilgisi= scanner.nextLine();
               String [] array = ogrenciBilgisi.split(",");
               if(array[1].equals("Bilgisayar Mühendisliği")){
                   System.out.println("Öğrenci bilgisi: "+ogrenciBilgisi);
               }

            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException e) {
            System.out.println("Dosya açılırken bir hata oluştu");
        }

    }
}
