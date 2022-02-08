package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Kumanda implements Iterable<String>{
    public class KumandaIterator implements Iterator<String>{
        private int index =0;
        @Override
        public boolean hasNext() {
            if(index< channel.size()){
                return true;
            }
            return false;
        }

        @Override
        public String next() {
            String deger = channel.get(index);
            index++;
            return deger;

        }
    }

    private ArrayList<String> channel = new ArrayList<>();

    public ArrayList<String> getChannel() {
        return channel;
    }

    public Kumanda(String[] array){

        for(String s: array){
            channel.add(s);
        }

    }

    public void kanalEkle(String kanal){
        channel.add(kanal);
    }

    public void kanalSil(String kanal){
        if (channel.contains(kanal)) {
            channel.remove(kanal);
            System.out.println("Kanal silindi.");
        }
        else{
            System.out.println("Böyle bir kanal yok");
        }
    }

    public int kanalSayisi(){
        return channel.size();
    }

    @Override
    public Iterator<String> iterator() {
        //return channel.iterator();

        return new KumandaIterator();
    }
}
