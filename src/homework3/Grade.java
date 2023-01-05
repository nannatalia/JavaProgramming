package homework3;

public class Grade {
    public static void main(String[] args) {
        /*
        3. Create a class called Grade, a char variable named grade is given.
        write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid
         */
        char grade = 'B';
        String r = "";
        if(grade == 'A'){
            r = "Excellent";
        } else if (grade == 'B') {
            r = "Great Job";
        } else if (grade == 'C') {
            r = "Good";
        } else if (grade == 'D') {
            r = "Passed";
        } else if (grade == 'F') {
            r = "Failed";
        }else {
            r = "Invalid";
        }
        System.out.println(r);
    }
}
