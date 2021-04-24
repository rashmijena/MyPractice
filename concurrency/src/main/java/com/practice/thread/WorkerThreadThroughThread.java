package com.practice.thread;

public class WorkerThreadThroughThread extends Thread{

    public WorkerThreadThroughThread(String threadName){
        this.setName(threadName);
    }
    public void run(){
        System.out.println("Hello from thread:"+Thread.currentThread().getName());
    }
    public static void main(String args[]) throws InterruptedException {

        for (int i=0; i < 10; i++){
            Thread t1 = new WorkerThreadThroughThread("MyDummyThread-"+(i+1));
            t1.start();
            Thread.sleep(1000l);
        }


    }
}
