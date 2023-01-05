package day24_CustomMethods_Return.Practice;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        /*
           2. create a method named isAnagram that passes
           two String parameters, the method returns true if the given
           two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true
         */
        boolean res = isAnagram("cba", "dac");
        System.out.println(res);
    }
    public static boolean isAnagram(String str1, String str2){
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        boolean anagram = Arrays.equals(s1,s2);
        return anagram;
    }
}
