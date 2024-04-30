
package com.mycompany.multithreading1;


public class GetNameAndSetNameThread  extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println("thread task1");
    }
    public static void main(String[]args)
    {
        GetNameAndSetNameThread t = new GetNameAndSetNameThread();
        t.start();
        System.out.println(Thread.currentThread().getName());
        
    }

        
}
