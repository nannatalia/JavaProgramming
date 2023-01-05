package day15_ForLoops.Practice;

public class SumOfDigits {
    public static void main(String[] args) {
        /*
         6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...
         */
        String str = "A1B2C3";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char r = str.charAt(i);
            if (r >= '0' && r<='9'){
                sum+=r-48;
            }
        }
        System.out.println(sum);
    }
}
