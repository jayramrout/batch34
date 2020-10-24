package jrout.tutorial.core.collections;

import jrout.tutorial.core.classesExample.Person;

import java.util.*;

public class SortingObjects {
    public static void main(String[] args) {
//        List<Person> personList1 = Arrays.asList(new Person("A", 10), new Person("B", 11));

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("A",10));
        personList.add(new Person("Z",11));
        personList.add(new Person("B",13));
        personList.add(new Person("D",5));

        System.out.println(personList);

        Collections.sort(personList, new NameSorting());

        System.out.println(personList);

        Collections.sort(personList, new AgeSorting());
        System.out.println(personList);


        personList.sort(new AgeSorting());
        personList.sort(new NameSorting());


        // anonymous class
        Comparator ageComparater = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        };

        // Anonymous inner class
        personList.sort(new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });



        personList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        personList.sort(Comparator.comparing(Person::getName));

    }


}

class NameSorting implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class AgeSorting implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.valueOf(o1.getAge()).compareTo(Integer.valueOf(o2.getAge()));
    }
}
