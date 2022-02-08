package com.su.thread2;



public class Test1 {
    public static void main(String[] args) {
      /* Printer printer= new Printer("printer");
       Printer printer1= new Printer("printer1");
       printer.run();
       printer1.run();

       */
        Thread printer = new Thread(new Printer("printer"));
        Thread printer1= new Thread(new Printer("printer1"));
        printer.start();
        printer1.start();
        System.out.println("Main thread çalışıyor");
    }
}
