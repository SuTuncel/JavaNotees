package com.su.thread2;
// thread olarak kullanma yöntem 2
public class Printer  implements Runnable{
    private String isim;

    public Printer(String isim){
        this.isim= isim;
    }

    @Override
    public void run() {
        System.out.println(isim+ " çalışıyor");
        for(int i=1; i<10; i++){
            System.out.println(isim+ " yazıyor "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Kesintiye uğrama hatası");
            }
        }
        System.out.println(isim+ " işini bitirdi");
    }
}
