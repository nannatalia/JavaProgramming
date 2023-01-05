package homework4;

public class Range {
    public static void main(String[] args) {
        /*
          Task 7 : Write a method that given 2 int values,
           return true if either of them is in the range 10..20 inclusive.
            multiple parameter  --- takes two integers
            return type --- boolean

             in1020(12, 99) → true
             in1020(21, 12) → true
             in1020(8, 99) → false
         */
        boolean isitin1020 = in1020(33,99);
        System.out.println(isitin1020);
    }
    public static boolean in1020( int n1, int n2){

        return (n1 < 20 && n1 > 10) || (n2 < 20 && n2 > 10);
    }
}
