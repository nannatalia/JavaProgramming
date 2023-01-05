package homework2;

public class NumberToWord {
    public static void main(String[] args) {
        /*
        1. Create a class called NumberToWord, and write a java program
        that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One
         */
        int n = 4;
        String number;
        if (n == 1) {
            number = "One";
        } else if (n == 2) {
            number = "Two";
        } else if (n == 3) {
            number = "Three";
        } else if (n == 4) {
            number = "Four";
        } else if (n == 5) {
            number = "Five";
        } else if (n == 6) {
            number = "Six";
        } else if (n == 7) {
            number = "Seven";
        } else if (n == 8) {
            number = "Eight";
        } else
            number = "Nine";
        System.out.println("number = " + number);
    }
}
