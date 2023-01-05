package homework2;

public class OxygenTank {
    public static void main(String[] args) {
        /*
        4. Create a class called OxygenTank. You are diving in the ocean.
        Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

         */
        int oxi = 98;
        if(oxi>90){
            System.out.println("Your tank is full");
        } else if (oxi>80 && oxi<=90) {
            System.out.println("Still okay");
        } else if (oxi>70 && oxi<=80) {
            System.out.println("Don't go too far");
        } else if (oxi>60 && oxi<=70) {
            System.out.println("Start to head back");
        }else {
            System.out.println("Be careful now you are at 50%");
        }
    }
}
