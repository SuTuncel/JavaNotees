package dosyadanNotOkuma;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Not {

    public static void main(String[] args) {

        try(BufferedWriter writer= new BufferedWriter(new FileWriter("not.txt"))) {

            writer.write("Hatice Günday,70,90,20\n");
            writer.write("Mustafa Akyürek,90,80,60\n");
            writer.write("Ramazan Topaloğlu,60,30,50\n");
            writer.write("Elif Akşit,80,40,80\n");
            writer.write("Mehmet Düşenkalkar,70,20,40\n");
            writer.write("Hatice Dağdaş,90,90,80\n");
            writer.write("Merve Tütüncü,40,30,30\n");
            writer.write("Hatice Pekkan,50,70,60\n");
            writer.write("Şerife Kumcuoğlu,40,70,70\n");
            writer.write("Mehmet Babacan,70,60,60\n");
            writer.write("Fatih Akman,100,10,60\n");
            writer.write("Ayşe Kurutluoğlu,50,10,80\n");
            writer.write("Hanife Poçan,100,50,10\n");
            writer.write("Ali Oraloğlu,20,20,90\n");
            writer.write("Zeliha Beşerler,100,80,20\n");
            writer.write("Ali Akan,90,90,80\n");
            writer.write("Yusuf Hamzaoğlu,100,40,90\n");
            writer.write("Mahmut Akışık,40,80,20\n");
            writer.write("Emre Kurutluoğlu,70,80,100\n");
            writer.write("Halil Gökgöz,80,10,20\n");
            writer.write("Ramazan Paksüt,90,20,20\n");
            writer.write("Osman Adan,30,90,50\n");
            writer.write("Sude Balcı,60,10,40\n");
            writer.write("İbrahim Erez,50,60,40\n");
            writer.write("Zeliha Demirel,70,40,100\n");


        } catch (IOException e) {
            System.out.println("Dosyayı yazarken hata oluştu");
        }


    }


}
