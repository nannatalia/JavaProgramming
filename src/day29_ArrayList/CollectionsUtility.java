package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 9, 8, 7,6,5,4,3,2,1));

        Collections.sort(list);
        System.out.println(list);

        System.out.println("-----------------------------------");

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        System.out.println(list2);

        Collections.reverse(list2);
        System.out.println(list2);

        System.out.println("-----------------------------------");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70));

        Collections.swap(list3, 2,3);
        System.out.println(list3);

        System.out.println("-----------------------------------");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        int max=Collections.max(list4);
        int min=Collections.min(list4);
        System.out.println(max);
        System.out.println(min);

        System.out.println("-----------------------------------");

        ArrayList<Integer> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));

        Collections.replaceAll(list5, 10, 1000);

        System.out.println(list5);

        System.out.println("-----------------------------------");

        int frequency = Collections.frequency(list5, 1000 );

        System.out.println("frequency = " + frequency);

        System.out.println("-----------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Python", "Python", "Ruby", "C#", "Java"));

        int countJava = Collections.frequency(words, "Java");
        int countPython = Collections.frequency(words, "Python");

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);

    }
}
