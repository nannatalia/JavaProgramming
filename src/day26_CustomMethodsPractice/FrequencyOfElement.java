package day26_CustomMethodsPractice;

public class FrequencyOfElement {
    public static void main(String[] args) {
        /*
        asks:
	1. Create a class named FrequencyOfElement:
			1.1 Create a method that passes two parameters:
			 an integer array and an Integer element.
			  The method returns the frequency of the given integer element from the integer array

			1.2 Create a method that passes two parameters:
			a double array and a double element.
			The method returns the frequency of the given integer from the array

			1.3 Create a method that passes two parameters:
			 a char array and a char element.
			 The method returns the frequency of the given char element from the char array

			1.4 Create a method that passes two parameters:
			 a String array and a String element.
			 The method returns the frequency of the given String element from the String array
         */
        int frequency = FrequencyOfAnElement(new int[]{1,1,1,1,2,3}, 1);
        System.out.println(frequency);
    }
    public static int FrequencyOfAnElement(int[] arr, int a){
        int count =0;
        for (int i : arr) {
            if(i==a){
                count++;
            }
        }
        return count;
    }
    public static int FrequencyOfAnElement(double[] arr, double a){
        int count =0;
        for (double i : arr) {
            if(i==a){
                count++;
            }
        }
        return count;
    }
    public static int FrequencyOfAnElement(char[] arr, char a){
        int count =0;
        for (char i : arr) {
            if(i==a){
                count++;
            }
        }
        return count;
    }
    public static int FrequencyOfAnElement(String[] arr, String a){
        int count =0;
        for (String i : arr) {
            if(i.equals(a)){
                count++;
            }
        }
        return count;
    }
}
