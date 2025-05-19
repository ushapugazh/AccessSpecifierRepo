package com.thread.java;

public class WaitNotifyTest {

	public static void main(String[] args) {
		Message msg = new Message("Hello usha lets test Wait and Notify");
		WaitMethodTest waiter1 = new WaitMethodTest(msg);
        new Thread(waiter1,"waiter1").start();
        
        WaitMethodTest waiter2 = new WaitMethodTest(msg);
        new Thread(waiter2, "waiter2").start();
        
        WaitMethodTest notifier = new WaitMethodTest(msg);
        new Thread(notifier, "notifier").start();
        System.out.println("Hello All the threads are started");
    }

	}


