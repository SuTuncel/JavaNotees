package Generics;

public class Yazdirma<E> { // bu E yi kullanarak farklı türlerdeki dizileri yaz
    public void yazdir(E[] dizi){

        for(E e: dizi) {
            System.out.println(e);
        }
    }


}
