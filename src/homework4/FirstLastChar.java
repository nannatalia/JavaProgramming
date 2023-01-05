package homework4;

public class FirstLastChar {
    public static void main(String[] args) {
        /*
        Task 6 : Write a method that return
        a new string where the first and last chars have been exchanged.


             frontBack("code") → "eodc"
             frontBack("a") → "a"
             frontBack("ab") → "ba"

         */
       String res =  frontBack("code");
        System.out.println(res);
    }
    public static String frontBack(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
        }
    }
}
