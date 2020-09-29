package classesExample;

public class Decoration {
    public void printDecoratedName(String name) {
        System.out.println(System.lineSeparator());

        System.out.println("*************");
        System.out.println("Welcome "+ name);
        System.out.println("*************");
    }


    public void printDecoratedName(int name) {
        System.out.println(System.lineSeparator());

        System.out.println("*************");
        System.out.println("Welcome "+ name);
        System.out.println("*************");
    }

    /*
        method overloading...
     */
    public void printDecoratedName(String fname, String lname) {
        System.out.println(System.lineSeparator());

        System.out.println("*************");
        System.out.println("Welcome "+ fname +" "+ lname);
        System.out.println("*************");
    }


    public void printDecoratedSomething(String fname, String lname) {
        System.out.println(System.lineSeparator());

        System.out.println("*************");
        System.out.println("Welcome "+ fname +" "+ lname);
        System.out.println("*************");

    }




    public String createDecoratedName(String name) {
        String decoratedText = "*************";
        decoratedText += "Welcome "+ name;
        decoratedText += "*************";

        return decoratedText;
    }



    public void testJustReturn(String fname) {
        System.out.println(System.lineSeparator());

        if(fname.equals("test"))
            return;
        // can i use continue or break....

        System.out.println("*************");
        System.out.println("Welcome "+ fname);
        System.out.println("*************");
    }

}
