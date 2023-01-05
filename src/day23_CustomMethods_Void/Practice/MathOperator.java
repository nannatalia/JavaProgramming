package day23_CustomMethods_Void.Practice;

public class MathOperator {
    public static void main(String[] args) {
        math(2,3,'*');
    }
    public static void math(int n1, int n2, char mathOperator){
        if(mathOperator == '+'){
            System.out.println(n1 + n2);
        } else if (mathOperator == '-') {
            System.out.println(n1 - n2);
        } else if (mathOperator == '*') {
            System.out.println(n1*n2);
        } else if (mathOperator == '/') {
            System.out.println(n1 / n2);
        }
    }
}
