package day15_ForLoops.Practice;

public class Replace {
    public static void main(String[] args) {
        /*
        7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
         */
        String word= "Wooden Spoon";
        String result = "";
        for (int i = word.length()-1; i >=0; i--) {
            result+=word.charAt(i);
        }
        System.out.println(result);
    }
}
