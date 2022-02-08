package dosyadanNotOkuma;

import java.io.*;
import java.util.Scanner;

public class MaiN {
    // yarın yeniden yaz
    public static String harfnotuHesapla(String isim, int vize1, int vize2,int fina){
        String cikti="";

        double toplam = (vize1*3/10.0)+(vize2*3/10.0)+(fina*4/10.0);

        if(toplam>=90){
            cikti= isim+": AA";
        }
        else if (toplam>=80){
            cikti=isim+": BA";
        }
        else if (toplam>=70){
            cikti=isim+": BB";
        }
        else if (toplam>=65){
            cikti=isim+": CB";
        }
        else if (toplam>=60){
            cikti=isim+": CC";
        }
        else if (toplam>=55){
            cikti=isim+": DC";
        }
        else if (toplam>=50){
            cikti=isim+": DD";
        }
        else {
            cikti=isim+ ": FF";
        }
        return cikti;
    }
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new FileInputStream("not.txt"));
            FileWriter writer= new FileWriter("harfNotları.txt")){

            while (scanner.hasNextLine()){
                String ogrencibilgileri= scanner.nextLine();
                String [] array = ogrencibilgileri.split(",");
                int vize1=Integer.parseInt(array[1]);
                int vize2=Integer.parseInt(array[2]);
                int fina=Integer.parseInt(array[3]);
              String cikti= harfnotuHesapla(array[0],vize1,vize2,fina);
              writer.write(cikti+"\n");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
