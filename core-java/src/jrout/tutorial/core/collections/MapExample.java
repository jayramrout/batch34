package jrout.tutorial.core.collections;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // List Set
        List<String> students = Arrays.asList("StudA", "StudB", "StudC", "StudD");
        List<String> Beanchers = Arrays.asList("BeanA", "BeanB", "BeanC", "BeanD");
        List<List<String>> mappleSchool = new ArrayList<>();
        mappleSchool.add(students);
        mappleSchool.add(Beanchers);
        System.out.println(mappleSchool);

        List<String> students2 = Arrays.asList("StudAA", "StudBB", "StudCC", "StudDD");
        List<String> Beanchers2 = Arrays.asList("BeanAA", "BeanBB", "BeanCC", "BeanDD");

        List<List<String>> peterSchool = new ArrayList<>();
        peterSchool.add(students2);
        peterSchool.add(Beanchers2);
        System.out.println(peterSchool);

//      Map<String , List<List<String>>> schoolMap = new HashMap<>();
        Map<String , List<List<String>>> schoolMap = new Hashtable<>();
        schoolMap.put("PeterSchools", peterSchool);
        schoolMap.put("MappleSchool", mappleSchool);

        System.out.println(schoolMap);

        List<List<String>> peterSchool1 = schoolMap.get("PeterSchools");
        System.out.println(peterSchool1);
        // how to iterate a map...

    }

}
