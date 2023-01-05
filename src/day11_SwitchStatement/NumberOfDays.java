package day11_SwitchStatement;

public class NumberOfDays {
    public static void main(String[] args) {
        int n = 2 ;
        int year = 2009;
        if(n>=1 && n<=12){
            switch (n){
                case 2:
                   if(year % 4 ==0){
                       System.out.println("29 days");
                   }else
                       System.out.println("28 days");
                   break;
                case 4: case 6: case 9: case 11:
                    System.out.println("30 days");
                    break;
                default:
                    System.out.println("31 days");
                    break;
            }

        }else{
            System.out.println("Invalid Number");
        }
    }
}
