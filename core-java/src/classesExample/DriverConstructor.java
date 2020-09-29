package classesExample;

import java.util.Arrays;

public class DriverConstructor {
    public static void main(String[] args) {

//        Laptop() // constructor... this is a default constructor.
        Laptop laptop = new Laptop("Macbook",2000); // at the time of creation you initialize it...
        laptop.setColor("White");

        System.out.println(laptop.getName());
        System.out.println(laptop.getCost());


        Laptop sony = new Laptop("Sony",1500,"Black");
        sony.printDetails();

        new Laptop("Macbook");

        new Laptop();

    }
}
