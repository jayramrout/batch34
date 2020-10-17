package collections;

import classesExample.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListObjects {
    public static void main(String[] args) {
//        List<Person> personList1 = Arrays.asList(new Person("A", 10), new Person("B", 11));

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("A",10));
        personList.add(new Person("Z",13));
        personList.add(new Person("B",11));

        for(Person p : personList){
            System.out.println(p);
        }


    }
}
