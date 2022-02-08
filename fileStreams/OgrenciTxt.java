package fileStreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OgrenciTxt {

    public static void main(String[] args) {
        try(BufferedWriter writer= new BufferedWriter( new FileWriter("öğrenciler.txt"))) {
            writer.write("Mustafa Murat Coşkun,Bilgisayar Mühendisliği\n");
            writer.write("Oğuz Artıran,Finansal Matematik\n");
            writer.write("Mehmet Gençol,Bilgisayar Mühendisliği\n");
            writer.write("Yusuf Mücahit Çetinkaya,İşletme\n");
            writer.write("Görkem Özer,İstatistik\n");
            writer.write("Semih Aktaş,Bilgisayar Mühendisliği\n");
            writer.write("Hasan Bayhan,İşletme\n");
            writer.write("Ali Ozan,İnşaat Mühendisliği\n");


        } catch (IOException e) {
            System.out.println("Öğrenciler dosyaya yazılırken hata oluştu ");
        }
    }
}
