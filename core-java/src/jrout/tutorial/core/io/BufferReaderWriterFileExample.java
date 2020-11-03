package jrout.tutorial.core.io;

import java.io.*;
/*
BufferedReader/FileReader -- plan text files..
BufferedWriter/FileWriter -- plan text files..
C:\Users\jrout\Development\Github\batch34\Batch34.drawio
 */
public class BufferReaderWriterFileExample {

    public static void main(String[] args)  {
        File file =
                new File("C:\\Users\\jrout\\Development\\Github\\batch34\\MyFirstFile.txt");
        File file2 =
                new File("C:\\Users\\jrout\\Development\\Github\\batch34\\MyFirstFile2.txt");

        try {
            FileReader reader = new FileReader(file); // FileInputStream()
            BufferedReader bufferedReader = new BufferedReader(reader); // BufferedInputStream

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2, true)); // BufferedInputStream

            int c ;
            while( (c = bufferedReader.read()) != -1){
//                System.out.print((char)c);
                bufferedWriter.write(c);

            }
            bufferedWriter.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
