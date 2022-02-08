package threads.semaphoree;

import java.util.concurrent.Semaphore;

public class SemaphoreOrn {
    private Semaphore sem = new Semaphore(3); // aynı anda üç thread çalıştırılabilir

    public void threadFonksiyonu(int id){
        try {
            sem.acquire(); // permit 0 değilse kod bloğuna giriyor ve pertmits'i bir azaltıyor
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread başlıyor...Id: "+id);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread çıkıyor...Id: "+id);
        sem.release();// permits 0 ise bir arttırıyor diğer threadler içeri girebiliyor
    }
}
