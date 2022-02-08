package threads.reentrant;

public class Test {
    public static void main(String[] args) {
        ReentrantLockOrn rtl = new ReentrantLockOrn();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                rtl.thread1Fonksiyonu();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                rtl.thread2Fonksiyonu();
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

        rtl.threadOver();

    }
}
