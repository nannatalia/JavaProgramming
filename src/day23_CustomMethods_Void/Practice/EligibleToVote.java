package day23_CustomMethods_Void.Practice;

public class EligibleToVote {
    public static void main(String[] args) {
        eligible(19,"USA");
    }
    public static void eligible(int age, String nationality){
        if(age>=18 && nationality.equals("USA")){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You can't vote");
        }
    }
}
