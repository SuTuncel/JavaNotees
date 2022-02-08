package com.su.thread1;

public class Test1 {

    public static void main(String[] args) {// bu çalıştığında otomatik olarak main thread çalışıyor
        Printer printer= new Printer("printer");
        Printer printer1= new Printer("printer1");

        printer.start();
        printer1.start();

        System.out.println("Main thread çalışıyor");

    }
}
