package threads.reentrant;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockOrn {

    private int say =0;
    private Lock lock= new ReentrantLock();
    private Condition condition= lock.newCondition();

    public void arttir(){
        for(int i=0; i<10000; i++) {
            say++;
        }
    }

    public void thread1Fonksiyonu(){
        lock.lock(); // anahtar bizde başka kimse giremez
        try { // eğer exception fırlatabilecek bir metod kullanılırsa finally ile direkt kapatılabilir
            System.out.println("Thread 1 çalışıyor");
            System.out.println("Thread 1 uynadılırmayı bekliyor");
            condition.await();
            System.out.println("Thread 1 uyandırıldı ve işlemine devam ediyor ");
            arttir();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); // anahtar teslim ediliyor başka threadler girebiliyor
        }



    }

    public void thread2Fonksiyonu(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Scanner su = new Scanner(System.in);

        lock.lock();

        System.out.println("Thread 2 çalışıyor");
        try {
            arttir();
            System.out.println("Devam etmek için bir tuşa basın");
            su.nextLine();
            condition.signal();
            System.out.println("Thread 1 uyandırıldı");
        }
        finally {
            lock.unlock();
        }



    }

    public void threadOver(){
        System.out.println("Sayı değişkeninin değeri: "+say);
    }



}
