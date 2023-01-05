package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aaabcccdeeefgggggggghiiiiiiiiijkkkkkkkkkl";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println("list = " + list);
        ArrayList<String> unique = new ArrayList<>();

        for (String s : list) {
            if(Collections.frequency(list, s)==1)
                unique.add(s);
        }
        System.out.println(unique);
    }
}
