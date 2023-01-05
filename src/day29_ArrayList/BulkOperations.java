package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list);
        list.removeAll(Arrays.asList(3,5,8));
        System.out.println(list);

        System.out.println("-----------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3));
        list2.retainAll(Arrays.asList(1,2,3));
        System.out.println(list2);

        System.out.println("-----------------------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll( Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));
        jobTitles.retainAll( Arrays.asList("QA", "SDET") );
        System.out.println(jobTitles);

        System.out.println("-----------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(  Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10) );

        boolean r1 = nums.contains(10);
        boolean r2 = nums.containsAll(Arrays.asList(3,4,5));

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("-----------------------------------------");

        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));

        /*
        ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll( Arrays.asList(names) );
        */

        System.out.println(namesList);

        System.out.println("-----------------------------------------");

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(arr));

        ArrayList<Integer> res = convertArrayToArrayList(new int[]{1,2,3,4,5});
        System.out.println(res);

    }
        public static ArrayList<Integer> convertArrayToArrayList(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
            for (int i : arr) {
                list.add(i);
            }
            return list;
        }
}
