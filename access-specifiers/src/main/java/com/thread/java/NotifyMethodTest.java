package com.thread.java;

public class NotifyMethodTest implements Runnable {

    private Message msg;
    
    public NotifyMethodTest(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
    	String name = Thread.currentThread().getName();
        System.out.println(name+" started");
        try {
            Thread.sleep(1000);
            synchronized (msg) {
                msg.setMsg(name+" Notifier work done");
                msg.notify();
                // msg.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
    }