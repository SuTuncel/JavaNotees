package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    //first in first out (ilk gelen ilk gider)

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Ahmet"); // ilk giren elemanımız
        queue.offer("Elif");
        queue.offer("Berkan");
        queue.offer("Mustafa"); // son giren elemanımız

        // System.out.println(queue.peek()); ilk giren elemanı bastırır

        for(String s: queue){
            System.out.println("Element: "+s);
        }

        System.out.println("***************************");

        System.out.println("Eleman çıkarılıyor: "+ queue.poll());

        System.out.println("***************************");

        for(String s: queue){
            System.out.println("Element: "+s);
        }

        System.out.println(queue.isEmpty()); // boşsa ture ddeğilse false döner


        while (!queue.isEmpty()){
            System.out.println("Eleman çıkarılıyor: "+ queue.poll());
        }

        System.out.println(queue.isEmpty());



    }



}
