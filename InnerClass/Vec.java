package InnerClass;

import java.util.Scanner;

public class Vec {
    private String isim;
    private int i;
    private int j;
    private int k;

    Vec(String isim){
        this.isim= isim;

        Scanner su = new Scanner(System.in);
        System.out.println(isim+"'in i j k değerlerini giriniz: ");
        System.out.println("i :");
        this.i= su.nextInt();
        System.out.println("j :");
        this.j= su.nextInt();
        System.out.println("k :");
        this.k= su.nextInt();
    }

    public String getIsim() {
        return isim;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public int getK() {
        return k;
    }
}
