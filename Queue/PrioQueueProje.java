package Queue;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;

class Hasta implements Comparable<Hasta>{
    private String isim;
    private String disease;
    private int first;

    Hasta(String isim, String disease){
        this.isim= isim;
        this.disease= disease;
        // Hastaliğa göre öncelik tanımladık

        if (disease.equals("Apandist")){
            this.first=1;
        }

        if (disease.equals("Yanık")){
            this.first=2;
        }

        if(disease.equals("Baş Ağrısı")){
            this.first=3;
        }

    }

    public String getIsim() {
        return isim;
    }

    public String getDisease() {
        return disease;
    }

    @Override
    public int compareTo(Hasta o) {

        if (this.first> o.first){
            return 1;
        }
        else if (this.first< o.first){
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Hasta adı: "+ this.isim+ " Hastalığı: "+ this.disease;
    }
}




public class PrioQueueProje {

    /*
    * Acil servis uygulaması
    * Apandist en yüksek
    * Yanık orta
    * Baş ağrısı düşük
    */

    public static void main(String[] args) {

        Queue<Hasta> Hqueue= new PriorityQueue<>();

        Hqueue.offer(new Hasta("Ayşe","Yanık"));
        Hqueue.offer(new Hasta("Sueda","Apandist"));
        Hqueue.offer(new Hasta("Murat","Baş Ağrısı"));
        Hqueue.offer(new Hasta("Burcu","Apandist"));

        int i =1;

        while (!Hqueue.isEmpty()){
            System.out.println(i+". Hasta Önceliği : "+ Hqueue.poll());
            i++;
        }

    }

}
