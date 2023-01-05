package day24_CustomMethods_Return;

public class ReturnStatement {
    public static void main(String[] args) {
     daysInWeek(2);
    }
    public static void daysInWeek(int n){
        if(n<1 ||n>7){
            return;
        }
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
