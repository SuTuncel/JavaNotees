package threads.waitNotify;

import java.util.Scanner;

public class WaitNotify {
    private Object lock= new Object();
    public void thread1Fonksiyonu(){
        synchronized (lock){
            System.out.println("Thread 1 çalışıyor");
            System.out.println("Thread 1 thread 2'nin kendisini uyandırmasını bekliyor");
            try {
                lock.wait(); // başka birisi onu uyandırana kadar ileri gidemez
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread 1 uyandı devam ediyor...");
        }

    }

    public void thread2Fonksiyonu(){
        Scanner su = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (lock){
            System.out.println("Thread 2 çalışıyor....");
            System.out.println("Devam etmek için bir tuşa basın");
            su.nextLine();

            lock.notify(); // bu olmazsa thread1fonksiyonu uyandırılmıyor program kilitleniyor
            System.out.println("Thread 1 uyandırıldı (2 sn içinde)");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


