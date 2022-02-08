package serializationn;

import java.io.Serializable;
// transient bunun içinde: dosya boyutu artacaksa bazı özellikleri serileştirmek istemeyebiliriz ve bazen bazı özellikler çok önemli olmuyor
public class Ogrenci implements Serializable { // serileştirmek için yaptık
  // private static final long serialVersionUID=1000; // dosya benzerliği kazalarından kurtulmak için kullanılabilir
    private String isim;
   // private transient int id; // java bunu serielştirmeyecek
    private int id;
    private String bolum;
    private static int ogrenciSayisi=0; // statik bir alan direkt serileştirmez ogrenci classına ait objeye ait değil bu yüzden java serileşemesinin gerek olmadığını düşünüyor transient gibi

    public static int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

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
