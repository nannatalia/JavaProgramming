package day15_ForLoops;

public class FirstLastName {
    public static void main(String[] args) {
        /*
        3. Write a program that asks user to enter first and last names,
        and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
         */
        String first = "jOsH";
        String last = "smiTH";
        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();
        System.out.println(first + " " + last);
    }
}
