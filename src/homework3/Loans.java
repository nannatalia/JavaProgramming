package homework3;

public class Loans {
    public static void main(String[] args) {
        /*
        6. Create a class called Loans,
        Given two variables salary and credit score,
        use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

         */
        int salary = 240000,
                creditScore = 2500;
       /* if(salary>60000 && creditScore>650){
            r = "Loan Approved";
        }else {
            r = "Loan Declined";
        }
        System.out.println(r);
    */
       String r =  (salary>60000 && creditScore>650)? "Loan Approved" : "Loan Declined";
        System.out.println(r);
    }
}
