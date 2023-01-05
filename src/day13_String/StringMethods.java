package day13_String;

public class StringMethods {
    public static void main(String[] args) {
        String word = "Cydeo";
        char ch = word.charAt(2);
        System.out.println(ch);

       /* char tenthchar = word.charAt(9);
        System.out.println(tenthchar); */
        System.out.println("-------------------------------------");

        String s1 = "Batch 25 is the best batch. Java programming language";
        int ch1 = s1.length();
        System.out.println(ch1);

        char lastChar = s1.charAt(ch1 - 1);
        System.out.println(lastChar);

        System.out.println("-------------------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase();

        System.out.println(str);

        System.out.println("-------------------------------------");

        String s = "JAVA";
        s = s.toLowerCase();

        System.out.println(s);
        // Today is a great day to learn java programming.
        String sentence = "Today is a great day to learn java programming.";
        sentence = sentence.toUpperCase();
        System.out.println(sentence);


    }
}
