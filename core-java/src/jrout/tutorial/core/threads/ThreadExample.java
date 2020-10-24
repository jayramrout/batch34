package jrout.tutorial.core.threads;

public class ThreadExample {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);

//        Runner.startRunning();
        Runner t1 = new Runner("Peter"); // create a thread
        t1.start(); // it goes to runnable state...

        Thread t2 = new Runner("Rob");
        t2.start();

        System.out.println("End of the program...");

    }
}

class Runner extends Thread {

    public Runner(String name){
        super.setName(name);
    }
    @Override
    public void run() {
        for(int i =0 ; i < 5 ; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + " " +Thread.currentThread().getName());
            // call another function ........
        }
    }

}


/*class Runner extends Thread {

    public Runner(String name){
        super.setName(name);
    }
    @Override
    public void run() {
        for(int i =0 ; i < 5 ; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + " " +Thread.currentThread().getName());
            // call another function ........
        }
    }
}*/


/*
    start...
    ---------get me somethingA 5 min  ...lista
    ---------get me somethingB 10 min ...lista
    ---------get me somethingC 4 min  ... lista
    ---------get me somethingD 2 min ... lista

    end
    21..minutes...
    start doing something with lista..
 */
