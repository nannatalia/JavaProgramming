package day09_IfStatement;

public class MedianNumber {
    public static void main(String[] args) {
        /*
        2. Create a class called MedianNumber. write a program that can find
the median number between three DIFFERENT given integers
Ex:
a = 10, b= 15, c = 20;
Output:
15 is the median number
Posibility #1: a could be median number
Posibility #2: b could be median number
Posibility #3: c could be median number
         */
        int a = 10, b=21, c=20;
        boolean pos1 = (a > b && a <c) || (a > c && a < b);
        if(pos1){
            System.out.println(a + " is the median number");
        }
        boolean pos2 = (b>a && b<c) || (b>c && b<a);
        if(pos2){
            System.out.println(b + " is the median number");
        }
        boolean pos3 = (c >b && c <a) || (c>a && c<b);
        if(pos3){
            System.out.println(c + " is the median number");
        }
    }
}
