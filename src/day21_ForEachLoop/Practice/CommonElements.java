package day21_ForEachLoop.Practice;

public class CommonElements {
    public static void main(String[] args) {
        /*
        3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
MUST use for each loops
         */
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {4,5,6,7,8};
        String result ="";
        for (int nr : arr1) {
            for (int nr2 : arr2) {
                if (nr == nr2) {
                    result += nr + " ";
                }
            }
        }
        System.out.println(result);
    }
}
