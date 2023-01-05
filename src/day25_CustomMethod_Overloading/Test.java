package day25_CustomMethod_Overloading;
import utilities.StringUtility;
public class Test {
    public static void main(String[] args) {
        String str = "Java Programming Language";
        StringUtility.printEachChar(str);
        System.out.println("-------------------------------------------------");
        String res = StringUtility.Reverse(str);
        System.out.println(res);
        System.out.println("-------------------------------------------------");
        boolean isPalindr = StringUtility.isPalindrome("level");
        System.out.println(isPalindr);
        System.out.println("-------------------------------------------------");
        String[] names = {"Akos", "Cica", "Lica", "Lili", "civic"};
        int count = 0;
        for (String name : names) {
            if(StringUtility.isPalindrome(name))
                count++;
        }
        System.out.println(count);
        String str1 = "AABBCCDDDE";
        String removeDuplicates = StringUtility.RemoveDuplicates(str1);
        System.out.println(removeDuplicates);
    }

}
