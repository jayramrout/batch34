package jrout.tutorial.core.collections;

import java.util.*;

public class ListSorting {
    public static void main(String[] args) {
        // alpha , 6 , 100
        // number 12


        List<String> alphabets = Arrays.asList("A", "C", "B");
        /*
        List<String> stringsx = new ArrayList<>();
        stringsx.add("A");
        stringsx.add("C");
        stringsx.add("B");
        */

        System.out.println(alphabets);
        System.out.println("After Sorting");

//        Collections.sort(alphabets);
        alphabets.sort(Comparator.naturalOrder());
        System.out.println(alphabets);

    }
}
