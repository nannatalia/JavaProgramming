package homework3;

public class GradeLevel {
    public static void main(String[] args) {
        /*
        1. Create a class called GradeLevel, Given a number(byte)
        grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given
         */
        byte gradeLevel = 3;
        String school = "";
        if(gradeLevel>=1 && gradeLevel<=18){
            if(gradeLevel>=1 && gradeLevel<=5){
                school = "Elementary School";
            } else if (gradeLevel>=6 && gradeLevel<=8) {
                school = "Middle school";
            } else if (gradeLevel>=9 && gradeLevel<=12) {
                school = "High school";
            } else if (gradeLevel>=13 && gradeLevel<=16) {
                school = "College";
            }else {
                school = "Grad school";
            }
        }else {
            school = "Invalid";
        }
        System.out.println(school);
    }
}
