package jrout.tutorial.core.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {

    public static void main(String[] args)  {
        File file =
                new File("C:\\Users\\jrout\\Development\\Github\\batch34\\MyFirstFile.txt");
        FileWriter writer = null;
        FileReader reader = null;
        try {
            writer = new FileWriter(file);
            writer.write("Hello batch 34 welcome to io operation");
            writer.write("Hello batch 34 welcome to io operation");

            // my buffer is for 1000 lines....
            writer.flush();

            reader = new FileReader(file);
            char[] in = new char[100];
            reader.read(in);
            for(char c : in){
                System.out.print(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
