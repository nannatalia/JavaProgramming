package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTasks {
    public static void main(String[] args) {
        /*
        warmup tasks:
	1. Write a program that can return the first unique elements from an arraylist

			Do not use indexOf & lastIndexOf methods


	2. Write a program that can find the maximum,
	minimum and average number from an arrayList of integers

         */
        ArrayList<String> list = new ArrayList<>();
        list.add("Adam");
        list.add("Bogdi");
        list.add("Daria");
        list.add("Adam");
        list.add("Bogdi");
        list.add("Akos");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            int count = 0;
            for (String s2 : list) {
                if (s.equals(s2))
                    count++;
            }
            if(count==1){
                System.out.println(s);
                break;
            }

        }
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,55,6,7,8));
        Integer min = list2.get(0);
        Integer max = list2.get(0);
        for (Integer integer : list2) {
            if(integer<min)
                min=integer;
        }
        for (Integer integer : list2) {
            if(integer>max)
                max=integer;
        }
        Integer sum = 0;
        for (Integer integer : list2) {
            sum+=integer;
        }
        int average = sum/list2.size();
        System.out.println("The maximum is: " + max);
        System.out.println("The minimum is: " + min);
        System.out.println("The average is: " + average);
    }
}
