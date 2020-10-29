package jrout.tutorial.core.operators;

import java.util.Scanner;

public class BooleanLogicalOperator_4_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first age");
        int age1 = scanner.nextInt();

        System.out.println("Please enter second age");
        int age2 = scanner.nextInt();

        boolean canPlaySoccer = (age1++ > 20) || (age2++ > 20); // post increment

        if (canPlaySoccer) {
            System.out.println("Can Plan Soccer");
        } else {
            System.out.println("Sorry cannot play soccer...");
        }


    }
}
