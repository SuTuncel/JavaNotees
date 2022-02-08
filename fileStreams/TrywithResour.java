package fileStreams;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TrywithResour {
    public static void main(String[] args) {
        try(FileWriter writer=new FileWriter("diller.txt")){
            Scanner su = new Scanner(System.in);
            String dil;
            while (true){

                System.out.print("Bir dil giriniz: ");
                dil=su.nextLine();

                if(dil.equals("-1")){
                    System.out.println("Bye bye...");
                    break;
                }
                writer.write(dil+"\n");

            }

        } catch (IOException e) {
            System.out.println("Dosya oluşturulurken hata oluştu");
        }


    }
}
