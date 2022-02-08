package threads.callabFutur;

import java.util.LinkedList;
import java.util.List;

// threadleri yarıda kesme thread ınterrupt oluşturma ınterrupted exception öğrenme
public class TestInterrupt {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread çalışıyor");
                for(int i=0; i<10000000; i++){
                    if(Thread.currentThread().isInterrupted()) {// thread'de interrupt olmadıysa false olduysa true döner
                        System.out.println("Kesintiye uğradı...");
                        return;
                    }
                    list.add(i);
                }

               /* for (int i=1; i<=10; i++){
                    System.out.println("Thread yazıyor: "+i);
                    try {
                        Thread.sleep(1000);
                        System.out.println("Uykumun "+i+". saniyesindeyim");
                    } catch (InterruptedException e) {
                        System.out.println("Uykum bölündü"); // threadi bitirmiyor yarıda kesiyor mesela thread uyuyorsa uyandırılıyor
                    }

                }
                */
                System.out.println("Thread kesintiye uğramadan işini bitirdi");
            }
        });
        t.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt(); // 2. saniyede uyku bölünücek ama program devam eder try-catch ile

    }
}
