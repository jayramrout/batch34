package jrout.tutorial.core.operators;

public class PrePostIncrement {
    public static void main(String[] args) {
        int age = 5;
//        int age4 = age;
        System.out.println(age);

//        int age2 = age++; // post increment : first assign and then increment
        int age2 = ++age; // pre increment : increment and assign...

        System.out.println(age2);
        System.out.println(age);
    }
}
