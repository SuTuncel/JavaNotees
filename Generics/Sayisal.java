package Generics;

public  class Sayisal extends Aday{

    public Sayisal(int turkce, int mat, int fen, int sosyal) {
        super(turkce, mat, fen, sosyal);
    }

    @Override
    int puanHesapla() {

        return getTurkce()*5+ getMat()*5+ getFen()*5+ getSosyal()*2;
    }
}
