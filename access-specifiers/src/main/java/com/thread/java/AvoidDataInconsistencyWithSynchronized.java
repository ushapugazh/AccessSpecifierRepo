package com.thread.java;

//its same as DataInconsistency only synchronized is added
public class AvoidDataInconsistencyWithSynchronized {

	 public static void main(String[] args) throws InterruptedException {
		    
	        ProcessingThread1 pt = new ProcessingThread1();
	        Thread t1 = new Thread(pt, "t1");
	        t1.start();
	        //t1.join(); with this code and line no 13 commented we will not get the DataInconsistency
	        Thread t2 = new Thread(pt, "t2");
	        t2.start();
	        //wait for threads to finish processing
	        t1.join();
	        t2.join();
	        System.out.println("Processing count="+pt.getCount());
	    }

	}

	class ProcessingThread1 implements Runnable{
	    private int count;
	    private Object mutex=new Object();
	    
	    @Override
	    public void run() {
	   synchronized (mutex) {
	        for(int i=1; i < 5; i++){
	            processSomething(i);
	        	count++;
	        		}
	    	  }
	    }

	    public int getCount() {
	        return this.count;
	    }

	    private void processSomething(int i) {

	        try {
	            Thread.sleep(i*1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	    
	}
