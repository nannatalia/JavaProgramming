package day24_CustomMethods_Return.Practice;

public class IsPalindrome {
    public static void main(String[] args) {
        /*
        4. By using the reverse method above to create another method named isPalindrome
         that passes a String parameter, the method returns true if the
          string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true

         */
        boolean result = isPalindrome("lpvel");
        System.out.println(result);
    }
    public static boolean isPalindrome(String str){
        String reversed = "";
        for(int i = str.length()-1; i>=0; i--){
            reversed+=str.charAt(i);
        }
        boolean res = reversed.equalsIgnoreCase(str);
        return res;
    }
}
