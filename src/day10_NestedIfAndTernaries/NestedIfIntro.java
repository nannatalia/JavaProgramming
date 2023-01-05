package day10_NestedIfAndTernaries;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 47823;

        if(score>=0 && score<=100){ // if the score is valid

            if(score>=60)
                System.out.println("Passed");
            else
                System.out.println("Failed");

        } else{
            System.out.println("Invalid score");
        }

        System.out.println("------------------------------------------------------");
    int age = 25;
    boolean id = false;

    if(id) {
        if (age >= 21) {
            System.out.println("Eligible to buy");
        } else {
            System.out.println("Not eligible");
        }
    }else {
        System.out.println("You can't buy");
    }

        System.out.println("--------------------------------------------------------");

        int nr = 243;

        if(nr>=1 && nr<=7 ){

            if(nr == 1){
                System.out.println("Monday");
            } else if ( nr == 2) {
                System.out.println("Tuesday");
            } else if ( nr == 3) {
                System.out.println("Wednesday");
            } else if ( nr == 4) {
                System.out.println("Thursday");
            } else if ( nr == 5) {
                System.out.println("Friday");
            } else if ( nr == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
        } else {
            System.out.println("Invalid Number");
        }
    }
}
