package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {
    public static void main(String[] args) {
        /*
        warmup tasks:
	1. write a program that can swap the first and last elements of an ArrayList

	2. Write a program that can move all the zeros to the last indexes of ArrayList

					Ex:
						list: {1,0,2,0,3,0,4,0}

					output:
						[1, 2, 3, 4, 0, 0, 0, 0]


	3. Write a program that can extract the special characters,
	 digits and letters from a string and stores them into separate ArrayLists of Characters
				Ex:
					str = "ABCD123$%#@&456EFG!"

				output:
					list1: {1, 2, 3, 4, 5, 6}
					list2: {A, B, C, D, E, F, G}
					list3: {$, %, #, @, &, !}
         */
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ana","Mario","Meli","Cici"));
        Collections.swap(list, 0, list.size()-1);
        System.out.println(list);

        System.out.println("--------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
        Collections.sort(list2);
        int freq = Collections.frequency(list2, 0);
        list2.removeAll(Arrays.asList(0));
        System.out.println(list2);
        for (int i = 0; i < freq; i++) {
            list2.add(0);
        }
        System.out.println(list2);

        System.out.println("--------------------------------------");

        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        System.out.println(chars);
        ArrayList<Character> listLetter = new ArrayList<>(chars);
        listLetter.removeIf(p -> !Character.isLetter(p));
        System.out.println(listLetter);
        ArrayList<Character> listDigits = new ArrayList<>(chars);
        listDigits.removeIf( p -> !Character.isDigit(p));
        System.out.println(listDigits);
        ArrayList<Character> listSpecial = new ArrayList<>(chars);
        listSpecial.removeIf(p -> Character.isLetterOrDigit(p));
        System.out.println(listSpecial);
    }
}
