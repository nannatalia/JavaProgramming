package day24_CustomMethods_Return;

public class ReturnStatement2 {
    public static void months(int n){
        if(n<1 || n>12){
            System.out.println("INVALID");
            return;
        }else {
            String res1 = (n == 1) ? "January" : (n == 2) ? "February"
                    : (n == 3) ? "March" : (n == 4) ? "April" : (n == 5) ? "May"
                    : (n == 6) ? "June" : (n == 7) ? "July" : (n == 8) ? "August"
                    : (n == 9) ? "September" : (n == 10) ? "October" : (n == 11) ? "November" : (n == 12) ? "December" : "Inavlid";
            System.out.println(res1);
        }
    }
}
