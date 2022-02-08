package Generics;

public class GenericMetod {

    public static void main(String[] args) {

        /*Character[] char_dizi ={ 'J', 'A', 'V', 'A' } ;
        Integer[] int_dizi={1,2,3,4,5,6};
        String [] st_dizi= {"Java","C++","Php"};
        Ogrenci[] ogrenci= {new Ogrenci("Mustafa"),new Ogrenci("Elif"),new Ogrenci("Merve")};

        yazdir(char_dizi);
        yazdir(int_dizi);
        yazdir(st_dizi);
        yazdir(ogrenci);*/

        Sayisal s1 = new Sayisal(30,35,15,10);
        Sayisal s2= new Sayisal(28,39,20,6);
        Sozel so1= new Sozel(40,13,3,20);
        Sozel so2= new Sozel(38,21,6,19);

        Sayisal birinci = birinci(s1,s2);
        System.out.println("Sayısal birinci puanı: "+birinci.puanHesapla());

        Sozel birincii= birinci(so1,so2);
        System.out.println("Sözel birinci puanı: "+birincii.puanHesapla());


    }

    public static <E extends Aday> E birinci(E e1, E e2){

        if (e1.puanHesapla()>e2.puanHesapla()){
            return e1;
        }
        else{
            return e2;
        }
    }


  /*  public static <E> void yazdir(E[] dizi){
        for(int i=0; i< dizi.length; i++){
            System.out.println(dizi[i]);
        }

    }*/
}
