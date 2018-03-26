package com.java7.synchronization;

/**
 * @author Kishore Routhu on 3/12/17 10:55 AM.
 */
public class SynchronizationDemo {

    public static void main(String[] args) {
        Sender sender = new Sender();

        ThreadedSend thread1 = new ThreadedSend("Hi", sender);
        ThreadedSend thread2 = new ThreadedSend("Bye", sender);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}


class Sender {
    public void send(String msg) {
        System.out.println("Sending \t" + msg);

        synchronized (this) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }

        System.out.println("\n" + msg + " sent");
    }
}

class ThreadedSend extends Thread {

    private String msg;
    Sender sender;

    ThreadedSend(String msg, Sender sender) {
        this.msg = msg;
        this.sender = sender;
    }

    @Override
    public void run() {
        //synchronized (sender) {
            sender.send(msg);
        //}
    }
}
