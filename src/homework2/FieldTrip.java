package homework2;

public class FieldTrip {
    public static void main(String[] args) {
        /*
        8. Create a class called FieldTrip.
        Your school goes on a Field trip each year.
        The place you go will be based on your grade.
        Given a variable gradeNumber (1-6) figure out the details of your field trip.
        Print the information at the end.

    Data based on grade:

        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt


         */
        int gradeNumber = 4;
        String loc1 = "Apple orchard",
                loc2 = "Zoo",
                loc3 = "Aquarium",
                loc4 = "Movie theatre",
                loc5 = "Museum",
                loc6 = "Six Flags";
        int n1 = 3,
                n2 = 7,
                n3 = 5,
                n4 = 2,
                n5 = 5,
                n6 = 8;
        String t1 = "Ms. Smith",
                t2 = "Mr. Lee",
                t3 = "Ms. Wilson",
                t4 = "Ms. Reyes",
                t5 = "Ms. Lela",
                t6 = "Mr. Watt";
        if(gradeNumber==1){
            System.out.println("Grade: "+ gradeNumber + "\nLocation: " + loc1 + "\nNumber Of Groups: " + n1 + "\nTeacher in charge: " + t1);
        } else if (gradeNumber==2) {
            System.out.println("Grade: "+ gradeNumber + "\nLocation: " + loc2 + "\nNumber Of Groups: " + n2 + "\nTeacher in charge: " + t2);
        } else if (gradeNumber==3) {
            System.out.println("Grade: "+ gradeNumber + "\nLocation: " + loc3 + "\nNumber Of Groups: " + n3 + "\nTeacher in charge: " + t3);
        } else if (gradeNumber==4) {
            System.out.println("Grade: "+ gradeNumber + "\nLocation: " + loc4 + "\nNumber Of Groups: " + n4 + "\nTeacher in charge: " + t4);
        } else if (gradeNumber==5) {
            System.out.println("Grade: "+ gradeNumber + "\nLocation: " + loc5 + "\nNumber Of Groups: " + n5 + "\nTeacher in charge: " + t5);
        }else {
            System.out.println("Grade: "+ gradeNumber + "\nLocation: " + loc6 + "\nNumber Of Groups: " + n6 + "\nTeacher in charge: " + t6);
        }
    }
}
