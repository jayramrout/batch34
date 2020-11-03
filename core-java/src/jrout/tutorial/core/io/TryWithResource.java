package jrout.tutorial.core.io;

import java.io.*;

public class TryWithResource {

    public static void main(String[] args) {
        File file =
                new File("C:\\Users\\jrout\\Development\\Github\\batch34\\MyFirstFile.txt");
        /*BufferedReader bufferedReader = null;
        FileReader reader = null;
        try {
            reader = new FileReader(file); // FileInputStream()
            bufferedReader = new BufferedReader(reader); // BufferedInputStream

            int c;
            while ((c = bufferedReader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }*/


        ///////// try with resource...
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            int c;
            while ((c = bufferedReader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
