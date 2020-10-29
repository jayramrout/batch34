package jrout.tutorial.core.basics;

import static jrout.tutorial.core.basics.Days.*;

/*
    get the day from java and print the day.
 */
public class PrintDays {
    public static void main(String[] args) {
        String day = "222222";
        printMessage(day);

        orderCoffee(Coffee.LARGE);
    }

    public static void printMessage(String day) {
        if(MON.equals(day)){
            System.out.println("happy Lazy day");
        }else if(TUE.equals(day)){
            System.out.println("Happy Tueeeeeeee");
        }else if(WED.equals(day)){
            System.out.println("Happy Wednesay");
        }else if(THUR.equals(day)){
            System.out.println("Happy THUR");
        }else if(FRI.equals(day)){
            System.out.println("Happy Weekend");
        }else if(SAT.equals(day)){
            System.out.println("Happy Monday");
        }else {
            System.out.println("No day specified");
        }

    }

    public static void orderCoffee(Coffee coffee) {
        if(coffee.equals(Coffee.LARGE)){
            System.out.println("Cost is $5");
            System.out.println("price is "+ Coffee.LARGE.getValue());
        }else if(coffee.equals(Coffee.MEDIUM)){
            System.out.println("Cost is $3");
        }else if(coffee.equals(Coffee.SMALL)){
            System.out.println("Cost is $1.5");
        }else {
            System.out.println("Please specify a proper type");
        }
    }

}
