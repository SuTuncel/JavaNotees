package fileStreams;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrit {

    public static void main(String[] args) {

        FileWriter writer = null;
        try {
            writer= new FileWriter("dosya.txt");
            writer.write("Elif Su Tuncel\n");
            writer.write("Mehmet Gençol\n");
        } catch (IOException e) {
            System.out.println("Dosya oluşurken hata oluştu");
        } finally {
            if(writer!=null){
                try{
                    writer.close();
                }catch (IOException ex){
                    System.out.println("Dosya kapatılırken hata oluştu");
                }
            }
        }


    }

}
