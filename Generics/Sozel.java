package Generics;

public class Sozel extends Aday {

    Sozel(int turkce, int mat, int fen,int sosyal){
        super(turkce, mat, fen, sosyal);
    }

    @Override
    int puanHesapla() {
        return getTurkce()*5+ getMat()*5+ getFen()*2+ getSosyal()*5;
    }
}
