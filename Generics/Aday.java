package Generics;

public abstract class Aday {
    private int turkce;
    private int mat;
    private int fen;
    private int sosyal;

    public Aday(int turkce, int mat, int fen, int sosyal) {
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
}
