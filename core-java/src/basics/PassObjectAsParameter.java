package basics;

//import classesExample.Person;
//import classesExample.Box;
import classesExample.*;
//import java.lang.String; // i don't have to import String class
// ..bcoz String class belongs to java.lang
// java.lang package is by default import in all the classes.

public class PassObjectAsParameter {


    public static void main(String[] args) {
        int age = 10;
        String name = new String("Peter");
        Person person = new Person();
        person.setName("Dan");

        Box box = new Box();

        System.out.println(person);
        /*
            call by value
            call by reference
         */
        modifyMyDetails(age, name, person);
        System.out.println("Final name "+ name); // why not Peter Pan
        System.out.println("Final Person Name "+ person.getName());
        System.out.println("age "+ age);
    }

    public static void modifyMyDetails(int age , String name , Person person) {

        age = age + 10;
        System.out.println(name);
        name = name.concat(" Pan");
        System.out.println(name); // Peter Pan

        System.out.println("============");
        System.out.println("Person Name Before "+ person.getName());
        String finalName = person.getName().concat(" Hellu");

        person.setName(finalName);

        System.out.println("Person Name After "+ person.getName());

    }

    public void add(int a, int b){}


}
