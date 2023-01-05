package day10_NestedIfAndTernaries;

public class IfStatementsWithoutCurlyBraces {
    public static void main(String[] args) {
        int n =10;
        String m = "";
        if(n==1)
            m = "January";
         else if (n==2)
            m = "February";
         else if (n==3)
            m = "March";
         else if (n==4)
            m = "April";
         else if (n==5)
            m = "May";
         else if (n==6)
            m = "June";
         else if (n==7)
            m = "July";
         else if (n==8)
            m = "August";
         else if (n==9)
            m = "September";
         else if (n==10)
            m = "October";
         else if (n==11)
            m = "November";
         else
            m = "December";

        System.out.println(m);
    }
}
