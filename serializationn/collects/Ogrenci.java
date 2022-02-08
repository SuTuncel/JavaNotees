package serializationn.collects;

import java.io.Serializable;

public class Ogrenci implements Serializable {

    private String isim;
    private int id;
    private String bolum;

    public Ogrenci(String isim, int id, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return  "İsim: "+isim+"\n"+
                "Id: "+id+"\n"+
                "Bolum: "+bolum+"\n";
    }
}

