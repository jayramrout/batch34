package jrout.tutorial.core.threads;

public class RunnableExample {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        RideHorse peterHorse = new RideHorse();
        Thread t1 = new Thread(peterHorse, "Peter");
        Thread t2 = new Thread(new RideHorse(), "Rob");

        t1.start();
        t2.start();

        System.out.println("End of the program...");

        System.out.println("State Of main Thread is : "+Thread.currentThread().getState());


    }
}

class RideHorse implements Runnable {

   /* public RideHorse(String name){
//        super.setName(name);
    }*/

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