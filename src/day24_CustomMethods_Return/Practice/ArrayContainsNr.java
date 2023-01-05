package day24_CustomMethods_Return.Practice;

public class ArrayContainsNr {
    public static void main(String[] args) {
        /*
        9. Create a method named contains that passes one integer array and
         one integer parameters, the method returns true if the given integer
          is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false
         */
        boolean result = contains(new int[]{1,2,3,4} , 4);
        System.out.println(result);
    }
    public static boolean contains(int[] arr, int nr){
        boolean res=false;
        for (int i : arr) {
            if(i==nr){
                res = true;
            }
        } return res;
    }

}
