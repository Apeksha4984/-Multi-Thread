package com.mycompany.multithreading1;

public class YieldThread extends Thread {

    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "   my  Thread");

        }
    }

    public static void main(String[] args) {
        YieldThread y1 = new YieldThread();
        YieldThread y2 = new YieldThread();
        y1.start();
        y2.start();
        for (int i = 1; i < 5; i++) {
            y1.yield();
            System.out.println(Thread.currentThread().getName() + "my   Thread");

        }

    }

}
