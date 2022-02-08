package Generics;

public class Gneric1 {
    public static void main(String[] args) {

        Character[] char_dizi ={ 'J', 'A', 'V', 'A' } ;
        Integer[] int_dizi={1,2,3,4,5,6};
        String [] st_dizi= {"Java","C++","Php"};
        Ogrenci[] ogrenci= {new Ogrenci("Mustafa"),new Ogrenci("Elif"),new Ogrenci("Merve")};

       Yazdirma<Character> yazdirchar = new Yazdirma<>(); // bu şekilde obje oluşturman gerekiyor
       Yazdirma<Integer> yazdirint = new Yazdirma<>();
       Yazdirma<String> yazdirst = new Yazdirma<>();
       Yazdirma<Ogrenci> yazdirogrenci= new Yazdirma<>();

       yazdirchar.yazdir(char_dizi);
        System.out.println("************");
        yazdirint.yazdir(int_dizi);
        System.out.println("************");
        yazdirst.yazdir(st_dizi);
        System.out.println("************");
        yazdirogrenci.yazdir(ogrenci);



    }
}
