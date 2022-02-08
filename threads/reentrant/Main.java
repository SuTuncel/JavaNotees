package threads.reentrant;

public class Main {

    public static void main(String[] args) {
        DeadLockOrn dL = new DeadLockOrn();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                dL.fonksiyon1();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                dL.fonksiyon2();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        dL.threadOver();


    }
}
