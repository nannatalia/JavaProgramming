package day12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        /*
        1. Create a class called GradeLevel, Given a number(byte) grade level
determine and print which school type someone is in.
grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
For Any Other grade: Invalid grade level given
         */
        byte gradeLevel = 124;
        String r = "";
        if(gradeLevel>=1 && gradeLevel<=18){
            switch (gradeLevel) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    r = "Elementary school";
                    break;
                case 6:
                case 7:
                case 8:
                    r = "Middle school";
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                    r = "High school";
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                    r = "College";
                    break;
                default:
                    r = "Grad school";
            }
        }else {
            r = "Invalid grade level given";
        }
        System.out.println(r);
    }
}
