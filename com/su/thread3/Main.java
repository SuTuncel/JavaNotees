package com.su.thread3;

public class Main { // anonim class yöntemiyle

    public static void main(String[] args) {
        Thread printer = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread çalışıyor");
                for(int i =1; i<11; i++){
                    System.out.println("thread:" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Zaman aşımına uğradı");
                    }
                }

            }
        });
        printer.start();
        System.out.println("Main thread çalışıyor");

        // objeye isim vermeden de yapabiliriz şöyle: ama bu objeyi daha sonra kullanamayız
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread çalışıyor");
                for(int i =1; i<11; i++){
                    System.out.println("thread:" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Zaman aşımına uğradı");
                    }
                }

            }
        }); // ; yerine .start() yazarsak bir defalık çalışacak thread oluşturduk



    }

}
