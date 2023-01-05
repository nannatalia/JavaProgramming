package day23_CustomMethods_Void.Practice;

public class Convert {
    public static void main(String[] args) {
        euro(2);
        lira(2);
        lb(2);
    }
    public static void euro(int dollar){
        double money = dollar*1.00648;
        System.out.println("The dollar in euro is: " + money);
    }
    public static void lira(int dollar){
        double money = dollar*18.6234;
        System.out.println("The dollar in lira is: " + money);
    }
    public static void lb(int kg){
        double lb = kg/0.45359237;
        System.out.println("The kg in lb is: " + lb);
    }
}
