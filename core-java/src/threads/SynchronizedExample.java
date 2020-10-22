package threads;

import java.util.concurrent.Executor;

public class SynchronizedExample {
    public static void main(String[] args) {
        Printer printer = new Printer(); // account A

        Computer c1 = new Computer(printer, "Peter"); //debit card-a associated with account A
        Computer c2 = new Computer(printer, "Silly"); // debit card-b associated with account A
        Computer c3 = new Computer(printer, "Billy"); // debit card-c associated with account A

        c1.start();
        c2.start();
//      c3.setPriority(Thread.MAX_PRIORITY);
        c3.start();

    }
}

class Computer extends Thread{
    public Computer(Runnable runnable , String name){
        super(runnable,name);
    }
}

class Printer extends Thread {
    @Override
    public synchronized void run() {

        for(int i = 0 ; i < 5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+ " "+ Thread.currentThread().getName());
        }
    }
}
