package day42_Exceptions;

public class MorningWorkout {
    /*
    MorningWorkOut:
			1. Do 30 push-ups and try pausing 1.5 seconds in each


			2. Do 20 Pull-ups and try pausing 2.5 seconds in each

     */
    public static void main(String[] args) {

        System.out.println("-----------------------PUSH-UPS--------------------------");
        for (int i = 1; i <= 30; i++) {
            System.out.print( "\rPush-Up " + i);
            sleep(1.5);
        }

        System.out.println("PUSH-UPS COMPLETED");

        System.out.println("-----------------------PULL-UPS--------------------------");

        for (int i = 1; i <= 20 ; i++) {
            System.out.print("\rPull-Up " + i);
            sleep(2.5);
        }

        System.out.println("PULL-UPS COMPLETED");

    }
    public static void sleep(double seconds){
        try{
            Thread.sleep((long)(seconds*1000));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
