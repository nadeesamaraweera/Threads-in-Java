package org.example;

class MyRunnable implements Runnable{

    @Override
    public void run(){
        System.out.println("My Second Thread");
    }
}

public class Main2 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
