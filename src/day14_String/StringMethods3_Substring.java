package day14_String;

public class StringMethods3_Substring {
    public static void main(String[] args) {
   String word = "Cydeo School";
   String brand =  word.substring(0,4 +1);
  // String brand =
        System.out.println(brand);

        String str1 = word.substring(6);
        System.out.println(str1);

        System.out.println();

        String word2 ="Java Programming Language";
        String s1 = word2.substring(0, word2.indexOf("a ")+1);
        System.out.println(s1);
        String s2 = word2.substring(word2.indexOf("P"), word2.indexOf("g ")+1);
        System.out.println(s2);
        String s3 = word2.substring(word2.indexOf("L"), word2.indexOf("e")+1);
        System.out.println(s3);
    }
}
