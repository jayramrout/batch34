package jrout.tutorial.core.operators;

public class RelationalOperator {
    public static void main(String[] args) {
        // Equals ==
        int age = 60;
        boolean isSame = (5 == 7);
        System.out.println(isSame); // false
        //
        System.out.println(5 != 7); // true

        System.out.println(5 > 7); // false
        System.out.println(5 < 7); // true
        System.out.println(5 >= 5); // true
        System.out.println(5 <= 7); // true

    }
}
