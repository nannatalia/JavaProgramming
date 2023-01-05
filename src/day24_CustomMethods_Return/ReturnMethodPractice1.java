package day24_CustomMethods_Return;

public class ReturnMethodPractice1 {
    public static void main(String[] args) {
        int maxNr = maximum(12,5);
        System.out.println("The max nr is: " + maxNr);
        maxNr*=2;
        System.out.println(maxNr);
    }
    public static int maximum(int n1, int n2){
        int max= 0;
        if(n1>n2){
            max=n1;
        }else {
            max=n2;
        }
        return max;
    }
}
