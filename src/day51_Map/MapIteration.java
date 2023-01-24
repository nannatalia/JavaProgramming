package day51_Map;

import java.util.*;

public class MapIteration {
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali",85);
        students.put("Alex",80);
        students.put("Ozan",99);
        students.put("Serkan",70);
        students.put("Andriy",98);

        Set<String> keys =  students.keySet();

        for (String key : keys) {
            System.out.println(key +" : " + students.get(key));
            //students.replace(key, students.get(key) + 5);
        }

        System.out.println("students = " + students);

        // remove all the students whose score is less than 90

        for (String key : keys) {
            if(students.get(key) < 90){
                System.out.println(key);
            }
        }

        Map<String, Integer> earlyBirds = new HashMap<>(); // score >= 90

        Map<String, Integer> angryBirds = new HashMap<>(); // score < 90

        for (String key : keys) {
            Integer grade = students.get(key);
            if(grade>=90){
                earlyBirds.put(key, grade);
            }else{
                angryBirds.put(key,grade);
            }
        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

        Set<String> names = students.keySet();

        System.out.println("--------------------------------------------------------");

       // Collection<Integer> scores = students.values();

        List<Integer> scores = new ArrayList<>(students.values());

        System.out.println("scores = " + scores);

        for (Integer score : scores) {
            System.out.println("score = " + score);
        }

        System.out.println("--------------------------------------------------------");

        int minScore = Integer.MAX_VALUE;
        int maxScore = Integer.MIN_VALUE;

        for (Integer score : scores) {
            if(score>maxScore){
                maxScore=score;
            }
            if(score<minScore){
                minScore=score;
            }
        }

        System.out.println("maxScore = " + maxScore);
        System.out.println("minScore = " + minScore);

        System.out.println("--------------------------------------------------------");

        int max = Collections.max(scores);
        int min = Collections.min( students.values() );

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("--------------------------------------------------------");

        // how many students has the score of 95 or greater

        int count = 0;

        for (Integer score : scores) {
            if(score>=95)
                count++;
        }

        /*
        for (String eachKey : students.keySet()) {
            Integer eachScore = students.get(eachKey);
            if(eachScore >= 95){
                count++;
            }
        }
*/

        System.out.println("count = " + count);

        System.out.println("--------------------------------------------------------");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            //System.out.println(entry);
            System.out.println(entry.getKey() +" : " +entry.getValue());
        }



    }
}
