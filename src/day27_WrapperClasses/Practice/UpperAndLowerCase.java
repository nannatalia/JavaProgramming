package day27_WrapperClasses.Practice;

public class UpperAndLowerCase {
    public static void main(String[] args) {
        /*
        4. Write program that returns true if the total
         number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
			*/
        String str = "JAVABb java";
        int count1 = 0;
        int count2 = 0;
        for (char c : str.toCharArray()) {
            if(Character.isUpperCase(c))
                count1++;
            if(Character.isLowerCase(c))
                count2++;
        }
        System.out.println(count2==count1);

    }
}
