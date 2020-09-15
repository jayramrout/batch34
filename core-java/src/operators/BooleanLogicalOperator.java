package operators;

public class BooleanLogicalOperator {
    public static void main(String[] args) {
        boolean isSame = (5 == 7); // false
        System.out.println(isSame); // false
        System.out.println(!isSame); // false

        boolean isTrue = 100/4 > 20; // true
        System.out.println(isTrue);

        boolean finalResult = isSame || isTrue;

        System.out.println(finalResult);


        System.out.println(!true);
    }
}
