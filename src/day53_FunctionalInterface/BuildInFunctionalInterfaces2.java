package day53_FunctionalInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterfaces2 {
    public static void main(String[] args) {
        //Create a function that can check if the Integer is contained in an array of integer, return boolean

        BiPredicate<Integer[] , Integer> contains = (a,b) ->{
            boolean result = false;
            for (Integer integer : a) {
                if(integer==b){
                    result = true;
                    break;
                }
            }
            return result;
        };
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        boolean r1 = contains.test(arr, 11);

        System.out.println("r1 = " + r1);

        System.out.println("---------------------------------------------");
        // create a function that can check if two strings are anagram

        BiPredicate<String, String> anagram = (a,b) -> {
            String[] arr1 = a.split("");
            Arrays.sort(arr1);
            String[] arr2 = b.split("");
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        };

        boolean r2 = anagram.test("abc", "bac");

        System.out.println("r2 = " + r2);

        System.out.println("---------------------------------------------");
        // create a function that can print the given string for given number of times

        BiConsumer<String, Integer> printing = (a, b) -> {
            for (Integer i = 0; i < b; i++) {
                System.out.println(a);
            }
        };
        printing.accept("abcd", 3);

        System.out.println("---------------------------------------------");

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid","SM");
        scrumTeam1.put("Nikita","Developer");
        scrumTeam1.put("Alina","Developer");
        scrumTeam1.put("Mert","PO");
        scrumTeam1.put("Lee","SDET");

        /*
        for (Map.Entry<String, String> entry : scrumTeam1.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();
            System.out.println(k + " : "+v);
        }
         */

        scrumTeam1.forEach(  (k, v) -> System.out.println(k+" : "+v) );


        System.out.println("---------------------------------------------");

        //1. create a function that takes two integers and returns the maximum integer
        BiFunction<Integer, Integer, Integer> maximum = (a,b) -> (a>b)? a: b;

        int max = maximum.apply(12,21);

        System.out.println("max = " + max);

        //2. create a function that can merge two integer arrays into a list

        BiFunction<int[], int[], List<Integer>> merge = (x, y) -> {
            List<Integer> list = new ArrayList<>();
            for (int i : x) list.add((Integer) i);
            for (int i : y) list.add(i);
            return list;
        };

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8};

        List<Integer> nums = merge.apply(arr1, arr2);

        System.out.println("---------------------------------------------");
        // 3. create a function that takes a  list of String and a list of Integer and merge them into a map
        /*
        names ==> {"Josh", "Daniel"}
        score ==> {100, 110}
        map ==> {Josh=100, Daniel=110}
         */
        BiFunction<List<String>, List<Integer>, Map<String, Integer>> mergeIntoMap = (a,b) -> {
            Map<String, Integer> result = new HashMap<>();
            for (int i = 0; i < a.size(); i++) {
                result.put(a.get(i), b.get(i));
            }
            return result;
        };
        List<String> names = new ArrayList<>(Arrays.asList("Layan", "Kseniia", "Aygun"));

        List<Integer> scores = new ArrayList<>(Arrays.asList(90, 95, 98));

        Map<String, Integer> students = mergeIntoMap.apply(names, scores);

        System.out.println(students);
    }
}
