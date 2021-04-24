package com.practice.thread;

public class WorkerThreadThroughRunnable implements Runnable{


    public void run(){
        System.out.println("Hello from thread:"+Thread.currentThread().getName());
        Thread.interrupted();

    }
    public static void main(String args[]) throws InterruptedException {

        for (int i=0; i < 10; i++){
            Thread t1 = new Thread(new WorkerThreadThroughRunnable(),"MyDummyThread-"+(i+1));
            t1.isInterrupted();
            t1.start();
            Thread.sleep(1000l);
        }


    }
}
