package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExampleLambda {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Pan", "Zoel", "Alpha","a","b");
        List<String> names2 = Arrays.asList("Peter", "Zoel", "Pan", "Alpha");

//        System.out.println(names.containsAll(names2));

//        names.forEach(obj -> System.out.println(obj));
        names.forEach(obj -> ArrayListExampleLambda.printMe(obj));
        names.forEach(ArrayListExampleLambda::printMe);

        System.out.println("Names with P");
        List<String> startWithP = new ArrayList<>();
        for(String name : names){
            if(name.startsWith("P"))
                startWithP.add(name);
        }
        System.out.println("List of Names with P "+ startWithP);

        List<String> p = names.stream()
                .filter(obj -> obj.startsWith("P"))
                .filter(obj -> obj.endsWith("r"))
                .collect(Collectors.toList());
        System.out.println(p);

        // Consumer Predicate and Supplier in jdk 1.8

    }

    static void printMe(String value){
        System.out.println("Value is "+ value);
    }

}
