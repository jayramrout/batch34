package collections;

import classesExample.Person;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        PrintDouble printDouble = new PrintDouble(Double.valueOf(10));
        printDouble.printValue();

        PrintString peter = new PrintString("Peter");
        peter.printValue();

        Print peter1 = new Print("Peter");
        peter1.printValue();

        Print print = new Print(Double.valueOf(12));
        print.printValue();

        PrintNumbers printNumbers = new PrintNumbers(Byte.valueOf("3"));
    }
}


// Generics or common function
class PrintDouble {

    private Double dval;
    public PrintDouble(Double dval){
        this.dval = dval;
    }

    public void printValue(){
        System.out.println("Printing value "+ dval.intValue());
    }
}

class PrintString{

    private String string;
    public PrintString(String dval){
        this.string = dval;
    }

    public void printValue(){
        System.out.println("Printing value "+ string);
    }
}

class Print<T> {
    private T val;
    public Print(T val){
        this.val = val;
    }
    public void printValue(){
        System.out.println("Printing Value "+ val);
    }
}


class PrintNumbers<T extends Number> {
    private T val;
    public PrintNumbers(T val){
        this.val = val;
    }
    public void printValue(){
        System.out.println("Printing Value "+ val);
    }
}

