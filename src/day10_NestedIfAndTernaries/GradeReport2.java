package day10_NestedIfAndTernaries;

public class GradeReport2 {
    public static void main(String[] args) {
        int grade = 78;
        String res1 = (grade>=0 && grade<=100)? (grade>=90 && grade<=100)? "Excellent" :(grade>=80 && grade<=89)? "Great" :(grade>=70 && grade<=79)? "Good" :(grade>=60 && grade>=69)? "Passed" : "Failed" :"Invalid score";
        System.out.println(res1);
    }
}
