package jrout.tutorial.core.classesExample;

public class DriverConstructor {

    static public void main(String[] args) {
    //        Laptop() // constructor... this is a default constructor.
        Laptop laptop = new Laptop("Macbook",2000); // at the time of creation you initialize it...
        laptop.setColor("White");

        System.out.println(laptop.getName());
        System.out.println(laptop.getCost());

        Laptop sony = new Laptop("Sony",1500,"Black");
        sony.printDetails();

        new Laptop("Macbook");

        //new Laptop();

        callMe();

//        new DriverConstructor().callMe();
        System.out.println(Laptop.count);


        System.out.println(Math.max(34,55));
    }

    public static void callMe(){
        System.out.println("Call Me");
    }


}
