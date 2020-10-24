package jrout.tutorial.core.operators;

public class BooleanLogicalOperator_3 {
    public static void main(String[] args) {

       System.out.println(args[0] +" "+ args[1]);

       int age1 = Integer.parseInt(args[0]);
       int age2 = Integer.parseInt(args[1]);

       boolean canPlaySoccer = (age1++ > 20) || (age2++ > 20); // post increment

        if(canPlaySoccer){
            System.out.println("Can Plan Soccer");
        }else {
            System.out.println("Sorry cannot play soccer...");
        }

        // ternary Operator...

        System.out.println(canPlaySoccer ? "Can Plan Soccer" : "Sorry cannot play soccer...");
        System.out.println
                (canPlaySoccer ? "Can Plan Soccer" : canPlaySoccer ? "Sorry cannot play soccer...": "");

    }
}
