package threads.waitNotify;

public class Test1 {
    public static void main(String[] args) {
        WaitNotify wN = new WaitNotify();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                wN.thread1Fonksiyonu();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                wN.thread2Fonksiyonu();
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
    }
}
