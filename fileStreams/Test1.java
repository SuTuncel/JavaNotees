package fileStreams;

import java.io.*;

public class Test1 { // FileOutputStream dosyaya veri yazmakve okumak

    public static void main(String[] args) {
        FileOutputStream fos=null;
        File file = new File("dosya.txt");
        try {
            fos= new FileOutputStream(file, true);// dosya.txt olarak file yerine de yazabilirim
           /* fos.write(65);
            fos.write(74);
            byte[] array= {101,75,66,65};
            fos.write(array);*/
            String s= "Java Programlama Dili ";
            byte[] s_array= s.getBytes(); // byte olarak çevirme işlemi bir şey yazmak için byte arrayine dönüştürmek zorundayız
            fos.write(s_array);
            // truenun anlamı dosya varsa veriyi sona ekle yoksa oluştur demek

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Dosyaya yazılırken bir hata oluştu");
        } finally { // ne olursa olsun kapanır
            try {
                if(fos!=null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("Dosya kapatılırken bir hata oluştu");
            }
        }
        FileInputStream fis= null;
        try {
            fis= new FileInputStream(file);
           /* System.out.println("Okunan değer: "+ (char) fis.read()); // okunana değeri chara dönüştürüyor
            System.out.println("Okunan değer: "+ (char) fis.read());
            fis.skip(5);
            System.out.println("Okunan değer: "+ (char) fis.read()); // o çıkar çünkü imleç v de duruyor şu an
       */
            int deger;
           String s = "";
           int say=0;
           fis.skip(5);
           while ((deger= fis.read())!=-1){
               s+= (char) deger;
               say++;
               if(say==10){
                   break;
               }
           }
            System.out.println("işaretlenen yerden itibaren: "+s);
          /*  while ((deger=fis.read())!=-1){
                s += (char) deger;

            }
            System.out.println("Dosya içeriği: "+s);

           */
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Dosya okunurken hata oluştu ");
        } finally {
            try {
                if(fis!=null){
                    fis.close();
                }

            } catch (IOException e) {
                System.out.println("Dosya kapatılamadı ");
            }
        }



    }


}
