package classesExample;

public class DriverClass_Reference {
    public static void main(String[] args) {
        Box squareBox = new Box(); // this is an instance of a box.
        squareBox.depth = 4;  // instance , object
        squareBox.height = 4;
        squareBox.width = 4;

        Box squareBoxRef = squareBox;

        System.out.println(squareBox.height);
        System.out.println(squareBoxRef.height);

        System.out.println("Changing height");
        squareBoxRef.height = 10;

        System.out.println(squareBox.height);
        System.out.println(squareBoxRef.height);



        Box squareBox2 = new Box(); // this is an instance of a box.
        squareBox2.depth = 4;  // instance , object
        squareBox2.height = 4;
        squareBox2.width = 4;

        Box rectBox = new Box(); // Rectagle
        rectBox.depth = 4;
        rectBox.height = 3;
        rectBox.width = 6;

        squareBox2 = rectBox;

        // what happens ???

        System.out.println(squareBox2.height);
    }
}
