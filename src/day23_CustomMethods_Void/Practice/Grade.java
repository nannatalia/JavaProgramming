package day23_CustomMethods_Void.Practice;

public class Grade {
    public static void main(String[] args) {
        gradeReport(99);
    }
    public static void gradeReport(int grade){
        if(grade<=59){
            System.out.println("F");
        } else if (grade<=69) {
            System.out.println("D");
        } else if (grade<=79) {
            System.out.println("C");
        } else if (grade<=89) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
}
