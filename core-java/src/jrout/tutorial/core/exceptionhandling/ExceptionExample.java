package jrout.tutorial.core.exceptionhandling;

import jrout.tutorial.core.exceptionhandling.exception.TooManyItemException;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNum [] = {1,4,5,6,7,2,4,9,0};

        System.out.println("Enter first number");
        int firstValue = scanner.nextInt();

        System.out.println("Enter second number");
        int secondValue = scanner.nextInt();

        System.out.println("Division of numbers is ");
        int finalValue = 0;
        int points = 0;
        try{
            finalValue = firstValue/secondValue; // ArithematicException
            points = randomNum[finalValue];

//            int num = Integer.parseInt("aaa");

        }catch (ArithmeticException exp){
            exp.printStackTrace();
            finalValue = 6;
            points = 0;
            // exp instanceof Ari // ArrayIOBE
//            System.exit(0);
        }catch (ArrayIndexOutOfBoundsException | NumberFormatException exp){
            points = 2;
        }catch (Exception exp){
            exp.printStackTrace();
        }finally {
            System.out.println("This is finally block..");
        }

        /*try{

        }finally {

        }*/

        System.out.println(finalValue);
        //hello compile time error

        if(finalValue > 5) {
            System.out.println("You are eligible for watching a movie..");
        }else if(finalValue > 7) {
            System.out.println("You are eligible for watching a movie+ pop corn..");
        }else {
            System.out.println("You should earn more points...");
        }

        System.out.println("You have earned random points "+ points);

        // depending of the final value you would be getting that number of envelops to post..

        gotoUSPS(finalValue); // this is uncaught...

        try{
            gotoUSPS(finalValue); // Un-caught exception...
        }catch (Exception exp){
            System.out.println("Sorry could not post to usps due to some problem");
        }

        System.out.println("End of the program...");
        try {
            gotoGrocery(66); // Caught Exception
        } catch (TooManyItemException e) {
            e.printStackTrace();
        }



    }


    /**
     * This throws RuntimeException which is UnCaught Exception.
     * @param numberOfEnvelops
     * @throws ArithmeticException
     * @throws ArrayIndexOutOfBoundsException
     */
    public static void gotoUSPS(int numberOfEnvelops) throws ArithmeticException , ArrayIndexOutOfBoundsException{

        int counterToPost = numberOfEnvelops/2;

        int counterNumber [] = {2,3,4,5,6,7,8,9};

        System.out.println("I am posting the envelops in counter number "+ counterNumber[counterToPost]);
        System.out.println("ExceptionExample.gotoUSPS");
    }


    public static void gotoGrocery(int noOfItems) throws TooManyItemException {

        if(noOfItems > 50) {
            throw new TooManyItemException("Your number is too high "+ noOfItems);
        }

        System.out.println("I am doing my groceries happy...");

    }
}
