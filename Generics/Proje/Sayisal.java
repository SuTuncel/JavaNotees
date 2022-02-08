package Generics.Proje;

public class Sayisal extends Aday {

    public Sayisal(String isim, int turkce, int mat, int fen, int sosyal) {
        super(isim, turkce, mat, fen, sosyal);
    }

    @Override
    int puanHesapla() {

        return getTurkce()*5+ getMat()*5+ getFen()*5+ getSosyal()*2;
    }
}
