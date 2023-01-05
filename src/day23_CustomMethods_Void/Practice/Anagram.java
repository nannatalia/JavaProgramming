package day23_CustomMethods_Void.Practice;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        anagram("listem", "silent");
    }
    public static void anagram(String str1, String str2){
        char[] ch1= str1.toCharArray();
        char [] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            System.out.println(str1 + " and "+ str2+ " are anagrams.");
        }else {
            System.out.println(str1 + " and  "+ str2+ " are not anagrams.");
        }
    }
}
