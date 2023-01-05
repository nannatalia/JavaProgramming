package day13_String.Practice;

public class CheckWords {
    public static void main(String[] args) {
        /*
        7. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
         */
        String w1 = "word";
        String w2 = "aaaa";
        String w3 = "bbbb";
        int length1 = w1.length();
        int length2 = w2.length();
        int length3 = w3.length();
        if(length1==length2 && length1 == length3){
            System.out.println("All word are the same length");
        } else if (length1!=length2 && length1 != length3 && length2!= length3) {
            System.out.println("All different length");
        } else {
            System.out.println("Not Same nor Different lengths");
        }
    }
}
