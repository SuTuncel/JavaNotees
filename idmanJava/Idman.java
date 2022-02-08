package idmanJava;

public class Idman {
// idmana log dosyası oluşturup dosyaya yazıcaz

    private int burpeesayisi;
    private int pushupsayisi;
    private int situpsayisi;
    private int squatsayisi;

    public Idman(int burpeesayisi, int pushupsayisi, int situpsayisi, int squatsayisi) {
        this.burpeesayisi = burpeesayisi;
        this.pushupsayisi = pushupsayisi;
        this.situpsayisi = situpsayisi;
        this.squatsayisi = squatsayisi;
    }

    public int getBurpeesayisi() {
        return burpeesayisi;
    }

    public void setBurpeesayisi(int burpeesayisi) {
        this.burpeesayisi = burpeesayisi;
    }

    public int getPushupsayisi() {
        return pushupsayisi;
    }

    public void setPushupsayisi(int pushupsayisi) {
        this.pushupsayisi = pushupsayisi;
    }

    public int getSitupsayisi() {
        return situpsayisi;
    }

    public void setSitupsayisi(int situpsayisi) {
        this.situpsayisi = situpsayisi;
    }

    public int getSquatsayisi() {
        return squatsayisi;
    }

    public void setSquatsayisi(int squatsayisi) {
        this.squatsayisi = squatsayisi;
    }

    public void hareketYap (String hareketturu, int sayisi) {

        if(hareketturu.equals("burpee")){
            burpeeYap(sayisi);
        }
        else if(hareketturu.equals("pushup")) {
            pushupYap(sayisi);

        }
        else if (hareketturu.equals("situp")) {
            situpYap(sayisi);
        }
        else if (hareketturu.equals("squat")) {
            squatYap(sayisi);
        }
        else {
            System.out.println("Geçersiz hareket...");
        }


    }
    public void burpeeYap(int sayi) {

        if (burpeesayisi==0 ) {
            System.out.println("Yapacak burpee kalmadı...");
        }
        else if (burpeesayisi-sayi<0) {
            System.out.println("Hedeflediğin burpee'yi geçtin.Tebrikler...");
            burpeesayisi=0;
            System.out.println("Kalan burpee: "+burpeesayisi);
        }
        else {
            burpeesayisi-=sayi;
            System.out.println("Kalan burpee: "+burpeesayisi);
        }


    }
    public void pushupYap(int sayi) {

        if (pushupsayisi==0 ) {
            System.out.println("Yapacak pushup kalmadı...");
        }
        else if (pushupsayisi-sayi<0) {
            System.out.println("Hedeflediğin pushup'ı geçtin.Tebrikler...");
            pushupsayisi=0;
            System.out.println("Kalan burpee: "+pushupsayisi);
        }
        else {
            pushupsayisi-=sayi;
            System.out.println("Kalan pushup:  "+pushupsayisi);
        }


    }
    public void situpYap(int sayi) {

        if (situpsayisi==0 ) {
            System.out.println("Yapacak situp kalmadı...");
        }
        else if (situpsayisi-sayi<0) {
            System.out.println("Hedeflediğin situp'ı geçtin.Tebrikler...");
            situpsayisi=0;
            System.out.println("Kalan situp: "+situpsayisi);
        }
        else {
            situpsayisi-=sayi;
            System.out.println("Kalan situp: "+situpsayisi);
        }


    }
    public void squatYap(int sayi) {

        if (squatsayisi==0 ) {
            System.out.println("Yapacak squat kalmadı...");
        }
        else if (squatsayisi-sayi<0) {
            System.out.println("Hedeflediğin squat'ı geçtin.Tebrikler...");
            squatsayisi=0;
            System.out.println("Kalan squat :"+squatsayisi);
            System.out.println("Kalan squat : "+squatsayisi);
        }
        else {
            squatsayisi-=sayi;
            System.out.println("Kalan squat: "+squatsayisi);
        }


    }

    public boolean idmanbittimi() {
        return(burpeesayisi==0 ) && (pushupsayisi==0 ) && (situpsayisi==0 ) && (squatsayisi==0 ) ;
    }



}
