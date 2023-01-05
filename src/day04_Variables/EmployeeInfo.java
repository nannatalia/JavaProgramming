package day04_Variables;

public class EmployeeInfo {

    public static void main(String[] args) {

        /* 6. Create a class named EmployeeInfo. declare the following
variables:
1. name (String)
2. age (int)
3. gender (char)
4. company (String)
5. jobTitle (String)
6. yearsOfExpereince (double)
7. salary (int)
8. isFullTime (boolean)
9. isMarried (boolean)
10. employeeId (String)
11. SSN (String) */
        String name = "Nan Natalia";
        int age = 19;
        char gender = 'F';
        String company = "Cydeo";
        String jobTitle = "Student";
        double yearsOfExperience = 1;
        int salary = 200000;
        boolean isFullTime = false;
        boolean isMarried = 100 > 300;
        String employeeId = "Nati Nan";
        String SSN = "idk";

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("company = " + company);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("salary = $" + salary);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);
        System.out.println("employeeId = " + employeeId);
        System.out.println("SSN = " + SSN);;
    }
}
