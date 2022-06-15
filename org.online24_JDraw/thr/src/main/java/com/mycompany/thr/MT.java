package com.mycompany.thr;

public class MT extends Thread {

    public void run() {
        for(int i=0; i<1000000; i++)
            System.out.println("Thread" + Thread.currentThread().getId() + " " +i);
    }
}
