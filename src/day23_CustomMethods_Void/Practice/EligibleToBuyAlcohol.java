package day23_CustomMethods_Void.Practice;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {
        alcohol(19);
    }
    public static void alcohol(int age){
        if(age<18){
            System.out.println("You can't buy alcohol");
        }else {
            System.out.println("You are eligible to buy alcohol");
        }
    }
}
