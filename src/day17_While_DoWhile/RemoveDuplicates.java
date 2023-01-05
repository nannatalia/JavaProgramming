package day17_While_DoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AABBBCCCDD";
        String r = "";
        for (int i = 0; i < str.length() ; i++) {
            String s = "" + str.charAt(i);
            if(r.contains(s)){
                continue;
            }
                r += s;
            }
        System.out.println(r);
        }
    }

