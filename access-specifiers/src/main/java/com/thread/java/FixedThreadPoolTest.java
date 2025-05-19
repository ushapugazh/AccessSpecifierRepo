package com.thread.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

 class WorkerThread implements Runnable {
	  
    private String msg;
    
    public WorkerThread(String s){
        this.msg=s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" The message is  = "+msg);
        processCommand();
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
 
}


public class FixedThreadPoolTest {
	public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("The value of I is : " + i);
            executor.execute(worker);
          }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
}
