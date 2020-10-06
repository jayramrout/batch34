package basics;


import static basics.H2kConstant.WELCOME_MESSAGE;
import basics.H2kConstant;

/**
 * Calculation Factorial of a number using for loop also.
 */
public class RecursionExample {
    public static void main(String[] args) {
//        System.out.println(H2kConstant.WELCOME_MESSAGE);
        System.out.println(WELCOME_MESSAGE);
        // factorial
        // 3 fact = 3 * 2 * 1
        // 4f = 4*3*2*1
        int factorial = factorial(10);
        System.out.println("factorial result ="+ factorial);
    }

    public static int factorial(int number) {
        int result = 0;
        if(number == 1)
            return number;
        result = number * factorial(number-1);
        return result;
    }

}