package threads;

public class WaitNotifyExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Reader reader1 = new Reader(calculator);
        Reader reader2 = new Reader(calculator);
        Reader reader3 = new Reader(calculator);

        reader1.start();
        reader2.start();
        reader3.start();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        calculator.start();
    }
}

class Reader extends Thread{
    Calculator calculator;
    public Reader(Calculator calc) {
        this.calculator = calc;
    }

    @Override
    public void run() {
        synchronized (calculator){
            try{
                System.out.println("Waiting for the calcualtion to finish..");
//                calculator.wait();
            }catch (Exception exp){

            }

            System.out.println("Total from calculator is "+ calculator.total);
        }
    }
}

class Calculator extends Thread{
    int total;
    @Override
    public void run() {
        synchronized (this){
            for(int i = 0; i < 10; i++) {
                total += i;
            }
            notifyAll();
        }

    }
}
