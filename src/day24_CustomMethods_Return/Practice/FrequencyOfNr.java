package day24_CustomMethods_Return.Practice;

public class FrequencyOfNr {
    public static void main(String[] args) {
        /*
        5. create method that accepts one integer array and
        one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5
         */
        int result = frquency(new int[]{1,2,2,3,4,5,6,6,6,6}, 6);
        System.out.println(result);
    }
    public static int frquency(int[] arr, int nr){
        int count = 0;
        for (int i : arr) {
            if(i==nr){
                count++;
            }
        }return count;
    }
}
