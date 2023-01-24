package day51_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice1 {
    public static void main(String[] args) {
        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        //  1. Update the "M" to Male and "F" to Female

        Set<String> names = employeeMap.keySet();

        /*
        for (String name : names) {
            String gender = employeeMap.get(name);
            if(gender.equals("M")){
                employeeMap.replace(name, "Male");
            }else{
                employeeMap.replace(name, "Female");
            }
            System.out.println(name + " : " + gender);
        }
         */

        for(Map.Entry<String, String> entry : employeeMap.entrySet()){
            if(entry.getValue().equals("M")){
                entry.setValue("Male");
            }else {
                entry.setValue("Female");
            }
        }
        System.out.println(employeeMap);

        System.out.println("--------------------------------------");

        //  2. Display the names of all female employees

        for (Map.Entry<String, String> entry : employeeMap.entrySet()){
            if(entry.getValue().equals("Female")){
                System.out.println(entry.getKey());
            }
        }


    }
}
