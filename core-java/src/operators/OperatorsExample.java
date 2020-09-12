package operators;

public class OperatorsExample {
    public static void main(String[] args) {
        // + addition
        // - sub..
        int val1 = 12;
        int val2 = 5;
        System.out.println(val1 +"\n");

        System.out.println("Divide :"+(val1/val2));
//        System.out.println("Divide : "+ (val1/val2));
        System.out.println("Add: "+ (val1 + val2));
        System.out.println("Modulus: "+ (val1 % val2));
        System.out.println("Multi: "+ (val1 * val2));

        val1 = val1+1; // 13
        System.out.println(val1);

        val1++; // 14 post increment
        System.out.println(val1);

        val1--; // 13

        System.out.println(val1);

//        val1 = val1 + 2; // 15
        val1 += 2; // 15 addition assignment

        System.out.println(val1);

    }
}
