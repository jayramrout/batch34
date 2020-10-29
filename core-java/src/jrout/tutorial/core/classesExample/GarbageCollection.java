package jrout.tutorial.core.classesExample;

public class GarbageCollection {
    public static void main(String[] args) {
        for (int i = 0 ; i < 100000;i++) {
            new Box(i+"");
        }

        /*Box box1 = new Box();
        Box box2 = new Box();*/

        /*System.out.println(box.height);
        System.out.println(box1.height);
        System.out.println(box2.height);// here box is still reachable
                                        // box1 is not reacheable
        System.out.println(box.height);

        System.out.println(box2.height);
        Box box3 = new Box(); // we can reclaim memory of box1 & box2
        System.out.println(box.height);*/

    }
}
