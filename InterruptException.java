package com.mycompany.multithreading1;

public class InterruptException extends Thread {

    public void run() {
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        InterruptException t = new InterruptException();
        t.start();
        t.interrupt();

    }

}
