package basics;

public class StringBufferExample {
    public static void main(String[] args) {
        /*String finalString = ""; // String is immutable.. cannot be changed...
        for(int i = 0 ; i < 10; i++) {
           finalString += i;
        }*/


        StringBuffer finalString = new StringBuffer(); // mutable.. can be changed
        for(int i = 0 ; i < 10; i++) {
            finalString.append(i);
        }

        System.out.println(finalString);
    }



}
