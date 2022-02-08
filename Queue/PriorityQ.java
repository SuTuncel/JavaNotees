package Queue;

import java.util.*;

class Player implements Comparable<Player> {
    private String isim;
    private int Id;

    public int getId() {
        return Id;
    }

    public String getIsim() {
        return isim;
    }

    Player(String isim, int Id ){
        this.isim= isim;
        this.Id=Id;
    }

    @Override
    public int compareTo(Player o) { // ben burada önceliği en büyük sayıya verdim o yüzden büyükten küçüğe sıralandı
        if(this.Id> o.Id){
            return -1;
        }
        else if (this.Id<o.Id){
            return 1;
        }

        return 0;

    }

    @Override
    public String toString() {
        return "Player{" +
                "isim='" + isim + '\'' +
                ", Id=" + Id +
                '}';
    }
}

public class PriorityQ {
    // öncelik sırasını yüksekliğine göre
    // mesela integer da en yüksek öncelik en küçük sayıda en düşük öncelik en büyük sırada
    // string'te alfabetik ilerliyor a-z

    // acil servi gibidir...
    // first in first out özelliği burda da var

    public static void main(String[] args) {
        Queue<Player> queue = new PriorityQueue<>();

        queue.offer(new Player("Ayşe",8));
        queue.offer(new Player("Murat",4));
        queue.offer(new Player("Oğuz",3));
        queue.offer(new Player("Selin",7));
        queue.offer(new Player("Su",1));

        while (!queue.isEmpty()){
            System.out.println("Element: "+ queue.poll());
        }


         /*
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(8);
        queue.offer(6);
        queue.offer(9);
        queue.offer(7);

        //tersten sıralama en düşük değerdeki ön sıraya yerleşiyor

        Queue<Integer> pqueue= new PriorityQueue<>(Collections.reverseOrder());
        pqueue.offer(5);
        pqueue.offer(1);
        pqueue.offer(2);
        pqueue.offer(8);
        pqueue.offer(6);
        pqueue.offer(9);
        pqueue.offer(7);


         while (!pqueue.isEmpty()){
            System.out.println("Element: "+pqueue.poll());
         }

        /*
        
        // foreach ile gösterirsek sırasıyla gelmez yazıldığı gibi gözükür 
        
        for ( Integer i :queue) {
            System.out.println("Element: "+i);
            
        }

        System.out.println("*************");

        // yüksek öncelikli ilk çıkacağı için sırasıyla basar. GERÇEK YAPISI

        while (!queue.isEmpty()){
            System.out.println("Element: "+queue.poll());
        }

       // System.out.println(queue.peek()); // baştaki elemanı basar

         */









    }

















}
