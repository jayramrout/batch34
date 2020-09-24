package loops;

public class BreakExample {
    public static void main(String[] args) {
        int numbers[] = {3,4,5,6,7,8,9,0,22,33,44};
        boolean isNumberFound = false;
        for(int num : numbers) {
            if(num == 7) {
                isNumberFound = true;
                break; // break out of the for loop.
            }
        }

        if(isNumberFound)
            System.out.println("Number is found..");
        else
            System.out.println("Sorry number is not found..");

    }
}
