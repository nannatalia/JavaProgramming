package utilities;

public class StringUtility {
    public static void printEachChar(String word) {
        for(int i=0; i<word.length();i++){
            System.out.println(word.charAt(i));
        }
    }
    public static String Reverse(String str){
        String result ="";
        for(int i = str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }
        return result;
    }
    public static boolean isPalindrome(String str){
        return Reverse(str).equalsIgnoreCase(str);
    }
    public static String RemoveDuplicates(String str){
        String res = "";
        for(int i = 0; i<str.length(); i++){
            String ch1 = str.charAt(i) + "";
            if(res.contains(ch1)){
                continue;
            }
            res+=ch1;
        }return res;
    }
}
