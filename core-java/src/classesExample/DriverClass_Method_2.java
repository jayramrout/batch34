package classesExample;

public class DriverClass_Method_2 {
    public static void main(String[] args) {
    // I am going to resuse a function...

        String names[] = {"Peter","Pan","Sam","Dony"};

        Decoration driver = new Decoration();
        driver.printDecoratedName(names[3]);

        /*driver.printDecoratedName("Romeo","Tan");
        driver.printDecoratedName(names[3]);
        driver.printDecoratedName(5);*/
        int age = 10;
        String message = driver.createDecoratedName("Juliet");
        System.out.println(message +" This is a Java Class.");

        driver.testJustReturn("test");

    }

    // create a function add2N(a, b)
    // create a function add3N(a,b,c)
    // variable args....
    // how to use var args to pass multiple parameter.... in java...

    // what is just return;
    // call the function


}
