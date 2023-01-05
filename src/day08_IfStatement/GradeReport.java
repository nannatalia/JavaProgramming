package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {
        /*
score:
    90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
    0 ~ 59 ==> Failed
 */
        int grade = 100;
        boolean a = grade <= 100 && grade >=90;
        if(a){
            System.out.println("Excellent");
        }
        boolean b = grade<=89 && grade >=80;
        if(b){
            System.out.println("Great");
        }
        boolean c = grade <=79 && grade >=70;
        if(c){
            System.out.println("Good");
        }
        boolean d = grade <= 69 && grade>=60;
        if(d){
            System.out.println("Passed");
        }
        boolean f = grade<=59 && grade>=0;
        if(f){
            System.out.println("Failed");
        }
    }
}
