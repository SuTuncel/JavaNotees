package frameWorks;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapMain {

    public static void main(String[] args) {
        // TreeMap kullanarak bir stringin içindeki harflerin frekansını bulmak

        Scanner su = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String cumle = su.nextLine();

        Map<Character, Integer> frekans = new TreeMap<>();

        for(int i=0; i<cumle.length(); i++){
            char c = cumle.charAt(i);
            if(frekans.containsKey(c)){ // map keyi içeriyor mu ona bakar
                frekans.replace(c,frekans.get(c)+1); // bu sayede karakterin sayısı artacak cümle içinde kaç kez geçtiğini bulabileceğiz
                // replace metodu keyin valuesunu değiştirir yeni değer koyarız
            }
            else{
                frekans.put(c,1);
            }
        }

        for (Map.Entry<Character,Integer> entry: frekans.entrySet()){
            System.out.println("Char: "+entry.getKey()+ "" +
                    " Num: "+ entry.getValue());
        }

    }
}
