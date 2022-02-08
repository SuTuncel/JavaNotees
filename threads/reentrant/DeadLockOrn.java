package threads.reentrant;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockOrn {
    private Hesap hesap1 = new Hesap();
    private Hesap hesap2= new Hesap();
    private Random rnd= new Random();

    private Lock lock1= new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    public void locklarıControl(Lock a, Lock b){ // deadlock çözümü
        boolean a_elde_edildi= false;
        boolean b_elde_edildi= false;

        while (true){
            // a elde edildiyse ama b elde edilmediyse ayı bırakmak gerekiyor
            a_elde_edildi=a.tryLock(); // müsatise alabilirsin true yoksa false
            b_elde_edildi=b.tryLock();

            if(a_elde_edildi==true && b_elde_edildi==true){
                return; // ikisi de elde edildiği için metodu sonlandırdım
            }
            if(a_elde_edildi==true){
                a.unlock(); // eğer boşsa fedakarlık edip bırakıyor
            }
            if (b_elde_edildi==true){
                b.unlock();
            }
        }
    }
    public void fonksiyon1(){
        locklarıControl(lock1,lock2);
        for(int i=0; i<5000; i++){
            Hesap.paraTransferi(hesap1,hesap2,rnd.nextInt(100));
        }
        lock1.unlock();
        lock2.unlock();

    }

    public void fonksiyon2(){
        locklarıControl(lock2,lock1);
        lock2.lock(); // lock1 yerine önce lock2 gelirse deadlock oluşabilir
        lock1.lock();
        for(int i=0; i<5000; i++){
            Hesap.paraTransferi(hesap2,hesap1,rnd.nextInt(100));
        }
        lock2.unlock();
        lock1.unlock();


    }

    public void threadOver(){
        System.out.println("Hesap1 bakiye: "+hesap1.getBakiye()+" Hesap2 bakiye: "+ hesap2.getBakiye());
        System.out.println("Toplam bakiye: "+(hesap1.getBakiye()+ hesap2.getBakiye()));
    }


}
