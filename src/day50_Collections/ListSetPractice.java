package day50_Collections;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println("set = " + set);

        //list over array: many methods, size is dynamic

        //Integer[] integerArr = set.toArray(new Integer[0]);

        List<Integer> list =  new ArrayList<>(set);

        System.out.println("list = " + list);

//        List<String> names = null;
//        System.out.println("names.size() = " + names.size());

        System.out.println("----------------------------------------");

        //pop(): ==> LIFO

        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A','B','C','D'));

        System.out.println("chars = " + chars);

        ((Stack) chars).pop();

        System.out.println("After popping: ");

        System.out.println("chars = " + chars);

        System.out.println("----------------------------------------");
        
        //poll() ==> FIFO

        List<String> names = new LinkedList<>();
        names.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Breanna", "Max"));

        System.out.println("names = " + names);

        ((LinkedList) names).poll();
        System.out.println("After poll:");
        System.out.println("names = " + names);

        ((LinkedList) names).poll();
        System.out.println("names = " + names);
    }
}
