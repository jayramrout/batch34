package array;

public class ArrayExample_2D_2 {
    public static void main(String[] args) {

        int ages[] = {5,6,7,8,9}; // 1 Dimensional array
        int height[] = {6,4,5,3,6}; // 1 Dimensional array

        for (int i = 0; i < ages.length; i++) {
            System.out.println("age = "+ ages[i] +" With height =" + height[i] );
        }

        int details_1[][] = new int[10][2];

        int details[][] = { {5,6}, {6,4} , {7,5}, {8,3}, {9,6}};
        System.out.println(details.length);

        System.out.println(details[0][0]); // 5
        System.out.println(details[0][1]); // 6

        // assignment : loop thru the 2d array and print all the info..
        // ages --> does this array has the value 6
        // if there is a value 6..then print.. its present...else say search not found...

    }
}
