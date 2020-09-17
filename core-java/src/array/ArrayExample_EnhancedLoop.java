package array;

public class ArrayExample_EnhancedLoop {
    public static void main(String[] args) {
        int heights[] = {2,3,4,5,6,7,8}; // single dimension array..
        for (int i = 0; i < heights.length; i++) {
            System.out.println(heights[i]);
        }

        // for each height in heights...just print the height
        // enhanced for loop....
        for(int height : heights) {
            System.out.println(height);
        }

    }
}
