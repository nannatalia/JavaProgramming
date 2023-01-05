package day24_CustomMethods_Return;

public class ReturnMethodIntro {
    public static void main(String[] args) {
        String str = "Jaaj";
        String result = reverse(str);
        System.out.println(result);
        if(str.equalsIgnoreCase(result)){
            System.out.println("Palindrome");
        }else {
            System.out.println("No palindrome");
        }
    }
    public static String reverse(String str){
        String result = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;
    }
}
