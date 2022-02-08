package exceptions.proje1;
import java.util.Scanner;

class SiyasiException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Siyasi yasağınız bulunmakta");
    }
}

class VizeException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Gdilecek ülkeye vize bulunmamaktadır");
    }
}
class HarcException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Harç miktarını tam giriniz");
    }
}

public class Yolcu {
    private int harc;
    private boolean siyasiYasak;
    private boolean vize;

    public Yolcu(){
        Scanner su = new Scanner(System.in);
        System.out.print("Yurtdışı harç bedeli: ");
        this.harc= su.nextInt();
        su.nextLine();

        System.out.print("Herhangi bir siyasi yasağınız bulunuyor mu: ");
        String cevap= su.nextLine();

        if(cevap.equals("evet")){
            this.siyasiYasak=true;
        }
        else {
            this.siyasiYasak=false;
        }

        System.out.print("Vizeniz bulunuyor mu: ");
        String cvp= su.nextLine();
        if (cvp.equals("evet")){
            this.vize=true;
        }
        else{
            this.vize=false;
        }

    }


    public void yurtdisiHarciKontrol() throws HarcException {
        if(this.harc<15){
            throw new HarcException();

        }
        else {
            System.out.println("Yurt dışı harcı işlemi tamam");

        }

    }


    public void siyasiYasakKontrol() throws SiyasiException {
        if (this.siyasiYasak){// siyasi yasak varsa çıkış yapılamaz
            throw  new SiyasiException();
        }else{
            System.out.println("Siyasi yasağınız bulunmamakta");

        }
    }


    public void vizeDurumuKontrol() throws VizeException {

        if(this.vize){
            System.out.println("vize işlemleri tamam");
        }
        else{
            throw new VizeException();
        }



















    }
}
