
package com.mycompany.multithreading1;


public class MethodThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().isAlive());
    }
    public static void main(String[]args)
    {
        MethodThread thread=new MethodThread();
        System.out.println("thread is start or not = "+thread.isAlive());
        thread.run();
        System.out.println("after starting a thread = "+ thread.isAlive());
        
    }
    
}
