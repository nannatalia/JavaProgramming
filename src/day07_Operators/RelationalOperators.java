package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // >, >=,<, <=

        boolean result1 = 200>40; //true

        System.out.println("result1 = " + result1);

        boolean result2 = 300>=150;

        System.out.println("result2 = " + result2);

        boolean result3 = 100>=100;

        System.out.println("result3 = " + result3);

        boolean result4 = 300>=500;

        System.out.println("result4 = " + result4);

        int creditScore = 745;
        boolean isEligibleForLoan = creditScore >= 720;
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);
    }
}
