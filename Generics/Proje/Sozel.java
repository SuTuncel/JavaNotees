package Generics.Proje;

public class Sozel extends Aday {

    Sozel(String isim, int turkce, int mat, int fen,int sosyal){
        super(isim, turkce, mat, fen, sosyal);
    }

    @Override
    int puanHesapla() {
        return getTurkce()*5+ getMat()*5+ getFen()*2+ getSosyal()*5;
    }
}
