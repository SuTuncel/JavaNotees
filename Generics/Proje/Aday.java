package Generics.Proje;

public abstract class Aday {

    private int turkce;
    private int mat;
    private int fen;
    private int sosyal;
    private String isim;

    public Aday(String isim,int turkce, int mat, int fen, int sosyal) {
        this.isim=isim;
        this.turkce = turkce;
        this.mat = mat;
        this.fen = fen;
        this.sosyal = sosyal;
    }

    public int getTurkce() {
        return turkce;
    }

    public int getFen() {
        return fen;
    }

    public int getMat() {
        return mat;
    }

    public int getSosyal() {
        return sosyal;
    }

    abstract int puanHesapla();

    public String toString(){
        return "İsim: "+isim + " Puanı: "+puanHesapla();
    }
}
