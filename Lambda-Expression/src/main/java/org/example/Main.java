package org.example;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
             for (int i =0; i<=5; i++){
                 System.out.println("Thread One");
             }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(()->{
            for (int i =0; i<=5; i++){
                System.out.println("Thread Two");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        Thread.sleep(10);
        t2.start();
    }
}