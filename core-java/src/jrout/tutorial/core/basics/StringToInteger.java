package jrout.tutorial.core.basics;

public class StringToInteger {
    public static void main(String[] args) {
        String one = "1";

        int two = 2;
        // to convert a integer string to a integer use Integer.parseInt();
       int one_ = Integer.parseInt(one);

        System.out.println(one_+two);
    }
}
