package Generics;

public class Ogrenci {
    private String isim;

    Ogrenci(String isim){
        this.isim=isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String toString(){
        return "İsim:"+isim;
    }
}
