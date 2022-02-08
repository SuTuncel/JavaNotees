package threads;

public class ThreadSafe {
    private int count =0;

    public synchronized void arttir(){ // böyle yapınca thread1 ulaştığında thread1 in işi bitene kadar thread2 onu bekleyecek
        count++;
    }

    public void threadCalistir(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<5000; i++){
                    arttir();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<5000; i++){
                    arttir();
                }
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // bu ikisinin çalışmasından sonra alltaki main thread çalışacak
        System.out.println("Count değişkeninin değeri: "+count);


    }

    public static void main(String[] args) {
        ThreadSafe threadSafe= new ThreadSafe();

        threadSafe.threadCalistir();

    }

}
