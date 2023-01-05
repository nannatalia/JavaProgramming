package day13_String.Practice;

public class Same {
    public static void main(String[] args) {
        /*
        3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
         */
        String s1 = "level";
        char ch1 = s1.charAt(0);
        char lastch = s1.charAt(s1.length()-1);
        if (ch1==lastch){
            System.out.println("same");
        }else {
            System.out.println("Different");
        }
    }
}
