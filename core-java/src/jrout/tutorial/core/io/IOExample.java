package jrout.tutorial.core.io;

import java.io.File;

public class IOExample {
    public static void main(String[] args) {
        File file =
                new File("C:\\Users\\jrout\\Development\\Github\\batch34\\MyFirstFile.txt");

        System.out.println("file.canRead() = " + file.canRead());
        System.out.println("file.exists() = " + file.exists());
        System.out.println("file.getName() = " + file.getName());
        System.out.println("file.isDirectory() = " + file.isDirectory());

        File dir =
                new File("C:\\Users\\jrout\\Development\\Github\\batch34");

        System.out.println("dir.isDirectory() = " + dir.isDirectory());
        System.out.println("dir.isFile() = " + dir.isFile());

    }
}
