package day10_NestedIfAndTernaries;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        int s =435;
        /*
        if(s>=0 && s<=100){

            if(s>=60){
                System.out.println("Pass");
            }else {
                System.out.println("Fail");
            }

        }else{
            System.out.println("Invalid score");
        }
        */
        String res2 = (s>=0 && s<=100)? (s>=60)? "Passed" : "Failed" : "Invalid score";
        System.out.println(res2);
    }
}
