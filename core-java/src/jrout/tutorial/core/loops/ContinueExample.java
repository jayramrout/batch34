package jrout.tutorial.core.loops;

/**
 * @author jrout
 *
 */
public class ContinueExample {
    /**
     *  Code Review session
     *
     * @param args
     */
    public static void main(String[] args) {
        int numbers[] = {3,4,5,6,7,8,9,0,22,33,44};
        boolean isNumberFound = false;
        for(int num : numbers) {
            if(num == 7)
                continue;

            System.out.println(num);
        }




        for(int i=0; i<10; i++) {
            System.out.print(i + " ");
            if (i%2 == 0) continue;
            System.out.println("");
        }

        int a = 10;


        /*while (true){

            break;
        }*/


    }
}

/*
class MyOwnClass{

}
*/