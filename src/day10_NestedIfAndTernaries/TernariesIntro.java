package day10_NestedIfAndTernaries;

public class TernariesIntro {
    public static void main(String[] args) {
        int n = 100;
        if(n%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
        System.out.println("------------------------------------");
       String result =  (n%2==0)? "Even" : "Odd";
        System.out.println(result);

        System.out.println("------------------------------------");

        int age =23;
        String result2 = (age>=21)? "Eligible" : "Not eligible";
        System.out.println(result2);

        System.out.println("------------------------------------");

        int nr = 100;

        String result3 = (nr>0)? "Positive" :(nr<0)? "Negative" : "Zero";
        System.out.println(result3);
    }
}
