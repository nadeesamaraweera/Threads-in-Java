package org.example;

class  One implements  Runnable{

    @Override
    public  void  run(){
        for (int i=1; i<5 ;i++){
            System.out.println("Thread One");
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class  Two implements  Runnable{

    @Override
    public  void  run(){
        for (int i=1; i<5 ;i++){
            System.out.println("Thread Two");
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Runnable one = new One();
        Runnable two = new Two();

        Thread t1= new Thread(one);
        Thread t2= new Thread(two);

        t1.start();
        Thread.sleep(10);

        t2.start();
        Thread.sleep(10);

    }
}