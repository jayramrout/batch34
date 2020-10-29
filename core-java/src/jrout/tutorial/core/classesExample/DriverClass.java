package jrout.tutorial.core.classesExample;

public class DriverClass {
    public static void main(String[] args) {
        /*
            new Box() as a TV
            Box squareBox = remote control.
         */



        new Box(); // an object will be created but there is no reference pointing to this object.

        /*
            squareBox is a reference(remote Control) to the Box Object.
         */

        Box squareBox = new Box(); // this is an instance of a box.
        squareBox.depth = 4;  // instance , object
        squareBox.height = 4;
        squareBox.width = 4;

        Box rectBox = new Box();
        rectBox.depth = 4;
        rectBox.height = 3;
        rectBox.width = 6;



        // Box box = new Rectangle()
        // Animal animal = new Dog();
        // Dog dog =new Dog();

        // create a sq
        /*Box squareBox2 ;
        if(input == sq){
            squareBox2 = new Box();
            squareBox2.height = 3;
            squareBox2.width = 3;
            squareBox2.depth = 3;
        }*/
        System.out.println("Width : "+ squareBox.width +" Height = "+ squareBox.height);
        System.out.println("Width : "+ rectBox.width +" Height = "+ rectBox.height);

        rectBox.width = 5;

        System.out.println("Width : "+ squareBox.width +" Height = "+ squareBox.height);
        System.out.println("Width : "+ rectBox.width +" Height = "+ rectBox.height);


//      int age = 10;
//        Box sBox = null;
//        System.out.println(sBox.width); // java.lang.NullPointerException

        // Are these object equal
        System.out.println("rectBox == squareBox "+ (rectBox == squareBox));

        //        Laptop laptop = new Laptop();
//      Laptop laptop1 = new Box();


    }
}
