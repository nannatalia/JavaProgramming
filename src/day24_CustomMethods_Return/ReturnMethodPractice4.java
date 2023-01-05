package day24_CustomMethods_Return;

public class ReturnMethodPractice4 {
    public static void main(String[] args) {
        String str = "AABBBC";
        String s = duplicates(str);
        System.out.println(s);
    }

    public static String duplicates(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String each = str.charAt(i) + "";
            if (!result.contains(each)) {
                result += each;
            }
        }
        return result;
    }
}