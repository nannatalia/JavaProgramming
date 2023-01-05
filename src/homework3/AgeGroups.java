package homework3;

public class AgeGroups {
    public static void main(String[] args) {
        /*
        4. Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )

             if age is negative or greater than 150, print invalid
         */
        int age = 65;
        String r = "";
        if(age>=0 && age<=150){
            if(age<21){
                r = "Teenager";
            } else if (age>=21 && age<55) {
                r = "Adult";
            } else {
                r = "Senior";
            }
        }else {
            r = "Invalid";
        }
        System.out.println(r);
    }
}
