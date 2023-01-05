package day21_ForEachLoop.Practice;


public class Palindrome {
    public static void main(String[] args) {
        /*
        4. write a program that can count how many palindromes in an array of string
        Ex:


            output:
                2
         */
        String [] palindrome={"anna","level","java","racecar","madam","google"};
        int count=0;
        for (String each : palindrome) {
            String reverse="";
            for (int i =each.length()-1; i >=0 ; i--) {
                reverse+=each.charAt(i);
                if (reverse.equals(each)){
                    count++;
                }
            }

        }
        System.out.println("There are "+count+" palindromes.");
    }
}

