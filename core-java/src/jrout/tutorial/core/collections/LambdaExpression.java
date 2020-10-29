package jrout.tutorial.core.collections;

public class LambdaExpression {
    public static void main(String[] args) {
        Calculator calculator = new TaxCalculator2018();
        System.out.println(calculator.calc(2,3));

//        calculator = new TaxCalculator2019();
//        System.out.println(calculator.calc(2,3));

        calculator = new Calculator() { // anonimous class.
            @Override
            public int calc(int a, int b) {
                return a-b+30;
            }
        };

        System.out.println(calculator.calc(5,3));


        calculator = (a, b) -> a*b;
        int calc = calculator.calc(5, 10);
        System.out.println(calc);
        // anonimous class.

    }
}


@FunctionalInterface
interface Calculator{
    int calc(int a , int b);
    default void hello(){}
}

class TaxCalculator2018 implements Calculator{

    @Override
    public int calc(int a, int b) {
        return a+b+7;
    }
}

class TaxCalculator2019 implements Calculator{

    @Override
    public int calc(int a, int b) {
        return (a+b)/2;
    }
}

