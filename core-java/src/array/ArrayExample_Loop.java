package array;

public class ArrayExample_Loop {
    public static void main(String[] args) {
        int heights[] = {2,3,4,5,6,7,8}; // single dimension array..
        String names[] = {"Peter","Pan","Sam","Gagan"};
        System.out.println(names.length);
        // Loop...
        // initialize ; check the condition ; increment
        ;
        for(int i = 0;i < 5 ; i++) {
            System.out.println(i);
        }

        // For loop
        for(int i = 0 ;i < names.length ; i++) {
            System.out.println("names["+i+"] " + names[i]);
        }

        System.out.println("============WHILE Loop===========");
        int j = 0;
        // While Loop
        while(j < names.length) {
            System.out.println("names["+j+"] " + names[j]);
            j++;
        }
        System.out.println("============DO WHILE Loop===========");

        int k = 0;
        do{
            System.out.println("names["+k+"] " + names[k]);
            k++;
        }while (k < names.length);

        System.out.println("I am done...");
    }
}
