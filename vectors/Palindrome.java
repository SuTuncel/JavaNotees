package vectors;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    // bir cümlenin palindrome olup olamdığını bulmak
    // baştan okunuşuyla sondan okunuşu aynı araziküçükizara, kasaylabalyasak, ege,ada

    public static boolean isPalindrome(String cumle, Stack<Character> stack){
         // cümlenin yarısından sonrası için bu şekilde aldım
        for(int i= (cumle.length()/2)+1; i<cumle.length(); i++){

             // eğer bulunduğu stackin son elemanına eşit değilse palindrome değil
            if (cumle.charAt(i)!= stack.pop()){
                return false;
            }

        }

         //eğer cümlenin ilk yarısı son yarsına eşitse cümle palinrome

            return true;
    }

    public static void main(String[] args) {

       Scanner su = new Scanner(System.in);
       System.out.print("Bir cümle giriniz: ");
       String cumle = su.nextLine();

        Stack<Character> stack= new Stack<>();

        for (int i=0; i< cumle.length()/2; i++){
            stack.push(cumle.charAt(i));
        }

        if(isPalindrome(cumle,stack)){
            System.out.println("Bu cümle palindromedur.");
        }
        else{
            System.out.println("Bu cümle palindrome değildir. ");
        }

}

}
