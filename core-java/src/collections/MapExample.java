package collections;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // List Set
        List<String> students = Arrays.asList("StudA", "StudB", "StudC", "StudD");
        List<String> teachers = Arrays.asList("TeaA", "TeaB", "TeaC", "TeaD");
        List<List<String>> mappleSchool = new ArrayList<>();
        mappleSchool.add(students);
        mappleSchool.add(teachers);
        System.out.println(mappleSchool);

        List<String> students2 = Arrays.asList("StudAA", "StudBB", "StudCC", "StudDD");
        List<String> teachers2 = Arrays.asList("TeaAA", "TeaBB", "TeaCC", "TeaDD");

        List<List<String>> peterSchool = new ArrayList<>();
        peterSchool.add(students2);
        peterSchool.add(teachers2);
        System.out.println(peterSchool);

//      Map<String , List<List<String>>> schoolMap = new HashMap<>();
        Map<String , List<List<String>>> schoolMap = new Hashtable<>();
        schoolMap.put("PeterSchool", peterSchool);
        schoolMap.put("MappleSchool", mappleSchool);

        System.out.println(schoolMap);

        List<List<String>> peterSchool1 = schoolMap.get("PeterSchool");
        peterSchool1.get(0).get(2);
        // how to iterate a map...

    }

}
