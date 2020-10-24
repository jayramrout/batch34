package jrout.tutorial.core.array;

public class ArrayExample_1 {
    public static void main(String[] args) {

        int age1 = 10;
        int age2 = 11;
        int age3 = 12;
        int age4 = 13;
        int age5 = 14;
        // bag array container
        int ages[] = new int[6]; // i am creating a container wholes length is of size 5
        ages[0] = age1;
        ages[1] = age2;

        ages[4] = 14;
        ages[5] = 15;

        System.out.println(ages[2]);

        System.out.println(ages.length);

        int heights[] = {2,3,4,5,6,7,8}; // single dimension array..
        System.out.println("heights[2] = " + heights[2]);
        heights[2] = 100;
        System.out.println("After heights[2] = " + heights[2]);
        System.out.println("heights.length ="+ heights.length);

    }
}
