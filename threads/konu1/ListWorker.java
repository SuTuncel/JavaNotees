package threads.konu1;

import java.util.ArrayList;
import java.util.Random;
// senkronize kod bloğu yazıldı iki tane lock oluşturuldu

public class ListWorker {
    Random random= new Random();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    private Object lock1= new Object();
    private Object lock2 = new Object();

    public  void list1Deger(){

        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(2000));
        }
    }

    public  void list2Deger(){ // değerler ekledik
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(2000));
        }
    }

    public void degerAta(){

        for(int i=0; i<1000; i++){
            list1Deger();
            list2Deger();
        }
    }

    public void calistir(){
        Thread thread= new Thread(new Runnable() { // bin tane bu atayacak
            @Override
            public void run() {
                degerAta();
            }
        });

        Thread thread1 = new Thread(new Runnable() { // bin tane bu atayacak
            @Override
            public void run() {
                degerAta();
            }
        });
        long basla = System.currentTimeMillis();
        thread.start();
        thread1.start();
        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("List1: "+ list1.size()+ " List2: "+list2.size());

        long bitis = System.currentTimeMillis();
        long sonuc = bitis-basla;

        System.out.println("Geçen süre: "+ sonuc);
    }
}
