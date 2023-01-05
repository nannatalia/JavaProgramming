package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {

    public static void main(String[] args) throws InterruptedException{
        System.out.println("Hello");
        sleep(2.5);
        System.out.println("Hello 2");
        MorningWorkout.sleep(2.5);
        System.out.println("World");
    }
    public static void sleep(double seconds) throws InterruptedException {
            Thread.sleep((long) (seconds * 1000));
    }
}
