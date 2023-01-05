package day10_NestedIfAndTernaries;

public class GradeReport {
    public static void main(String[] args) {
        int grade = 78;
        String result = ""; // temporary
        if(grade>= 0 && grade<=100){
            if(grade <= 100 && grade>=90){
                result = "Excellent";
            } else if (grade<=89 && grade>=80) {
                result = "Great";
            } else if (grade<=79 && grade>=70) {
                result = "Good";
            } else if (grade<=69 && grade>=60) {
                result = "Passed";
            } else {
               result = "Failed";
            }
        }else {
            result ="Invalid grade";
        }

        System.out.println("----------------------------------------------");


        System.out.println(result);

        System.out.println("----------------------------------------------");
    }
}
