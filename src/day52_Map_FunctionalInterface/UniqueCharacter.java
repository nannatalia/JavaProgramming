package day52_Map_FunctionalInterface;

import java.util.*;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str = "aabcccdeeeef";
        String[] str2 = str.split("");
        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : str2) {
            Integer count = Collections.frequency(Arrays.asList(str2), each);
            if(count==1){
                result.put(each, count);
            }
        }
        System.out.println(result);
    }
}
/*
1. Write a program that can find the unique characters from a String
			Ex:
					str = "aabcccdeeeef";
			output:
					{b=1, d=1, f=1}
 */
