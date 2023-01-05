package homework2;

public class FindTheResult {
    public static void main(String[] args) {
        /*
        Task 6: Create a class which is "FindTheResult" create a variable
    int a=15;
         if a is divisable by 3 add 20
         if a is divisable by 5 add 25
         if a is divisable by 15 add 50
         */
        int a = 15;
        if(a%3==0){
            System.out.println(a+=20);
        } else if (a%5==0) {
            System.out.println(a+=25);
        }else {
            System.out.println(a+=50);
        }
    }
}
