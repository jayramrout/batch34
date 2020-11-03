package jrout.tutorial.core.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/*
    java OO [OO ] ------------------------------------ OO laptop.dat
 */
public class ReadAndWriteObject {
    public static void main(String[] args) throws Exception{
        Laptop laptop = new Laptop();
        laptop.setCompany("Lenovo");
        laptop.setName("Thinkpad");
        laptop.setPrice(333.33f);

        FileOutputStream fileOutputStream =  new FileOutputStream("laptop.dat");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(laptop);
        outputStream.close();
        System.out.println(" Written successfully...");


        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("laptop.dat"));
        Laptop lt = (Laptop)objectInputStream.readObject();
        System.out.println("lt.getCompany() = " + lt.getCompany());
        System.out.println("lt.getPrice() = " + lt.getPrice());

        objectInputStream.close();
    }
}
