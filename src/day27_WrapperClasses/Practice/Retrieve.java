package day27_WrapperClasses.Practice;

public class Retrieve {
    public static void main(String[] args) {
        /*
        3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";


         */
        String str = "Wooden Spoon!";
        String digits = "";
        String letters = "";
        String specialChars= "";
        for (char c : str.toCharArray()) {
            if(Character.isDigit(c))
                digits+=c + "";
            if(Character.isLetter(c))
                letters+=c + "";
            if(!Character.isLetterOrDigit(c))
                specialChars+=c + "";
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }
}
