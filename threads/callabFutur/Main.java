package threads.callabFutur;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1); // aynı anda bir thread çalışabilir
/*
        executor.submit(new Runnable() {
            @Override
            public void run() {
                Random rnd = new Random();
                System.out.println("Thread çalışıyor");
                int sure = rnd.nextInt(1000)+2000; // 2000 ile 3000 arası uyutmak için
                try {
                    Thread.sleep(sure);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread çıkıyor...");

            }
        });

        executor.shutdown();
*/

        // runnable içindeki run metodu dönemez ama callable içindedi call metodu değer döndürebildiği için bunu kullanıyoruz

        Future<?> future= executor.submit(new Callable<Integer>() {
            // eğer callable'ı Integera atarsam ? integer olucak String'E atarsam string olucak

            @Override
            public Integer call() throws Exception {
                Random rnd = new Random();
                System.out.println("Thread çalışıyor");
                int sure = rnd.nextInt(1000)+2000; // 2000 ile 3000 arası uyutmak için
              /*  if (sure>2800){
                    throw new IOException("Thread çok uzun süre uyudu");
                }*/
                try {
                    Thread.sleep(sure);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread çıkıyor...");

                return sure; // kaç saniye uyuduğunu öğrenicez

            }
        });

        // sure değerini almak için Future generic interface kullanıyoruz

        executor.shutdown();
        try {
            System.out.println("Dönen değer: "+future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
