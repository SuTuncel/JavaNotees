package threads;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
    Random random = new Random();

    BlockingQueue<Integer> queue= new ArrayBlockingQueue<Integer>(10); // daha fazla gelmesini önlüyor

    public void produce(){

        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                Integer value= random.nextInt(100);
                queue.put(value);
                System.out.println("Producer üretiyor: "+value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }

    public void consume(){
        while(true){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                Integer value = queue.take();
                System.out.println("Consumer tüketiyor: "+value);
                System.out.println("Queue size: "+ queue.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
