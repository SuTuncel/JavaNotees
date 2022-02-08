package exceptions;

import java.util.Scanner;

public class TestThrow {
    // metodlara özel exception kullanmak için

    public static void mekanControl(int age) throws Exception {
        if(age<18){
            //  throw new ArithmeticException(); // on sekiz yaşından küçükse bunu fırlatıcak
       throw  new Exception("18 yaşından küçükler giremez"); //bu şekilde kullanmak için metodun kullanılacağı her yere exception imzası koyman gerekir

        }
        else{
            System.out.println("Mekana hoşgeldiniz...");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner su = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age= su.nextInt();

        mekanControl(age);






    }
}
