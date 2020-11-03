package jrout.tutorial.core.io;

import java.io.File;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws Exception{

        Scanner scanner =
                new Scanner(new File("C:\\Users\\jrout\\Development\\Github\\batch34\\core-java\\src\\jrout\\tutorial\\core\\threads\\RunnableExample.java"));

        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }
}
