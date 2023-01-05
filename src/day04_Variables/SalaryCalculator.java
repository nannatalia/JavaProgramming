package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        //HourlyRates, weekly hours

        int hourlyRate = 50;
        int weeklyHours = 40;
        int numberOfWeeks = 52;


        int salary = hourlyRate * weeklyHours * numberOfWeeks; //salary for a year

        //System.out.println(salary);
        System.out.println("salary = $" + salary);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("numberOfWeeks = " + numberOfWeeks);

    }
}
