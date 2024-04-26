
package com.mycompany.multithreading1;
class Mythread1 extends Thread{
    public void run(){
        System.out.println("start the thread");
    }
}
class Mythread2 extends Thread{
    public void run(){
        System.out.println("run the thread");
    }
}

public class MainThread {
    public static void main(String[]args){
        Mythread1 t1 = new Mythread1();
        t1.start();
        Mythread2 t2 = new Mythread2();
        t2.start();
    }
    
}
