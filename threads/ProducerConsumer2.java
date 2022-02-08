package threads;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

// wait ve notify metodları ile
public class ProducerConsumer2 {
    Random rnd = new Random();
    private Object lock= new Object();
    Queue<Integer> queue= new LinkedList<>();
    private int limit = 10;

    public void produce(){

        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock){
                if(queue.size()==limit){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Integer value= rnd.nextInt(100);
                queue.offer(value);
                System.out.println("Producer üretiyor: "+value);
                lock.notify();
            }
        }

    }

    public void consume(){
        while (true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock){
                if(queue.size()==0){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Integer value= queue.poll();
                System.out.println("Consumer tüketiyor: "+ value);
                System.out.println("Queue size: "+ queue.size());
                lock.notify();
            }
        }

    }

}
