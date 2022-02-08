package iterator;

import java.util.ArrayList;
import java.util.Iterator;


public class Radio implements Iterable<String>{
    private ArrayList<String> kanallar = new ArrayList<>();

    public class RadioIterator implements Iterator<String>{

        private int index =0;

        @Override
        public boolean hasNext() {
            if(index<kanallar.size()){
                return true;
            }
            return false;
        }

        @Override
        public String next() {
            String deger = kanallar.get(index);
            index++;
            return deger;
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }
    }

    public Radio(String[] kanals){ // gönderilen kanallar kanal listesine eklenmiş olacak
        for ( String kanal: kanals){
            kanallar.add(kanal);

        }
    }

    @Override
    public Iterator<String> iterator() {
        //return kanallar.iterator();
        return new RadioIterator();
    }
}
