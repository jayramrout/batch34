package collections;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
//        List<String> alphabets = Arrays.asList("A", "C", "B","C");
//        Set<String> alphabets = new HashSet<>(); // it removes duplicates..
        // [Zeeta, Alpha, Coor, Beta]
        Set<String> alphabets = new TreeSet<>();
        alphabets.add("Zeeta");
        alphabets.add("Zeeta");
        alphabets.add("Alpha");
        alphabets.add("Coor");
        alphabets.add("Beta");
//        alphabets.add("C");

        System.out.println(alphabets);


        System.out.println(new HashSet<>(Arrays.asList("A", "C", "B","C")));


        Set<String> alphabetNew = new HashSet<>();

        System.out.println("A".hashCode());
        alphabetNew.add("Aplle");
        alphabetNew.add("C");
        alphabetNew.add("India");
        alphabetNew.add("D");
        alphabetNew.add("Fish");
        alphabetNew.add("G");
        alphabetNew.add("H");
        alphabetNew.add("Big");
        alphabetNew.add("J");
        alphabetNew.add("E");

        System.out.println("alphabetNew = " + alphabetNew);

    }
}
