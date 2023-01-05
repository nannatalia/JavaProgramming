package day27_WrapperClasses;


public class WrapperClassMethods {
    public static void main(String[] args) {
        String str= "123";
        int n1 = Integer.parseInt(str);
        System.out.println(n1);

        String str2 = "10.3";
        double n2 = Double.parseDouble(str2);
        System.out.println(n2+1.7);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        String str3 = "true";
        boolean res1 = Boolean.parseBoolean(str3);
        System.out.println(res1);

        String str4 = "123";
        Integer n4 = Integer.valueOf(str4);
        System.out.println(n4);

        //isDigit() method
        char ch1 = '0';
        boolean r4 = Character.isDigit(ch1);
        System.out.println(r4);

        char ch2 = '-';
        boolean r5 = Character.isLetter(ch2);
        System.out.println(r5);

        boolean r6 = !Character.isLetterOrDigit(ch2);
        System.out.println(r6);

        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if( Character.isDigit(each) ){
                sum +=  Integer.parseInt(""+each);
            }

        }

        System.out.println("sum = " + sum);



    }
}
