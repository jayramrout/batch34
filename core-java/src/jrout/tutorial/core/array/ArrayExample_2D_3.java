package jrout.tutorial.core.array;

public class ArrayExample_2D_3 {

    public static void main(String[] args) {
        int harshDetails[] = {5, 20};
        int details[][] = {harshDetails, {6, 21}, {7, 22}, {8, 23}, {9, 24}};

        for (int i = 0; i < details.length; i++) {
            for (int j = 0; j <= details[i].length - 1; j++) {
                /*if (details[i][j] == 6) {
                    System.out.println("6 exists in " + details[i][j] + " " + i + " " + j);
                }*/
                System.out.print (details[i][j] +"   ");
            }
            System.out.println("");
        }
    }
}