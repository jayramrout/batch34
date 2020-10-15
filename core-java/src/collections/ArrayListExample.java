package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // Generics.
        list.add(new Integer(1)); // 0
        list.add(2); // auto boxed to Wrapper Type
        list.add(3);
        list.add(4);
        list.add(5); // 4

        System.out.println(list.size());
        System.out.println(list.get(0));

        list.add(6);
        list.add(7);
        System.out.println("list.size() = " + list.size());

        list.remove(1);

        System.out.println("list = " + list);

//        list.add("abc");

        System.out.println("list = " + list);

        for (int i = 0; i < list.size(); i++) {
            Integer item = list.get(i);
            System.out.println(item);
        }
        /*
        for each item in the list...copy it to the variable item..and print it.
         */
        for(Integer item : list){
            System.out.println(item);
        }


        Iterator<Integer> iterator1 = list.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }


        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            Integer item = iterator.next();
            System.out.println(item);
        }

        // Stream api..

        list.stream().forEach(item -> System.out.println(item));

        // 0 1 2 3 4 5 6 7 8 indexes
        // 1 2 3 4 5 6 7 8 9 values
        // 1 2 3 5 6 7 8 9 values

        //
        list.add(4,100);
        System.out.println("list = " + list);
    }


    public void copyTonewArray(){
        int items [] = {2,3,4,5,6,7,8,9}; // this is not growable...
        System.out.println(items.length);
//        items[8] = 10;

        int newItemArray [] = new int[20];
        int i = 0;
        for (; i < items.length; i++) {
            newItemArray[i] = items[i];
        }
        newItemArray[i++] = 10;


        for (int item: newItemArray) {
            System.out.println(item);
        }

    }


}
