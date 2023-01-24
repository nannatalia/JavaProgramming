package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {
// student name & score:

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 95);
        students.put("Ali",95);
        students.put("Alex",96);
        students.put("Ozan",98);
        students.put("Serkan",97);
        students.put("Andriy",98);

        students.put("Ali",85);
        students.put("Ali",86);
        students.put("Ali",87);

        System.out.println(students);
        System.out.println("students.size() = " + students.size());

        //Display the score of Alex

        System.out.println("Score of Alex = " + students.get("Alex"));

        // replace Ali' score to 90

        students.replace("Ali", 90);

        System.out.println("Score of Ali = " + students.get("Ali"));

        students.remove("Alex");

        System.out.println(students);

        students.remove("Ozan");

        System.out.println(students);

        boolean r1 = students.containsKey("Muhtar");
        boolean r2 = students.containsKey("Serkan");
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        boolean r3 = students.containsValue(97);

        System.out.println("r3 = " + r3);

        System.out.println("students.isEmpty() = " + students.isEmpty());


        System.out.println("-----------------------------------------------");

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);


        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        System.out.println(map1 ==  map2);
        System.out.println(map1.equals(map2));

        map1.clear();
        map2.clear();

        System.out.println(map1);
        System.out.println(map2);


    }
}
