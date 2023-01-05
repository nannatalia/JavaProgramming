package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        /*
        3. SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome

         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your hourly rate: ");
        double hourlyRate = input.nextDouble();

        input.nextLine();

        System.out.println("How many hours do you work in a week?");
        int hours = input.nextInt();

        input.nextLine();

        System.out.println("Enter your state tax:");
        double stateTax = input.nextDouble();

        input.nextLine();

        System.out.println("Enter the federal tax:");
        double federalTax = input.nextDouble();

        input.nextLine();

        double salary = hourlyRate*hours;
        double resultState = salary - salary*stateTax/100;
        double resultFederal = salary - salary*federalTax/100;
        double totalTax = resultFederal + resultState;
        double netIncome = salary - resultFederal - resultState;

        System.out.println("hourlyRate = " + hourlyRate + "\n");
        System.out.println("hours = " + hours + "\n");
        System.out.println("stateTax = " + stateTax + "\n");
        System.out.println("federalTax = " + federalTax + "\n");
        System.out.println("Your salary is : " + salary + "\n");
        System.out.println("The state tax is: " + resultState + "\n");
        System.out.println("The federal tax is: " + resultFederal + "\n");
        System.out.println("The total tax is: " + totalTax + "\n");
        System.out.println("The net income is: " + netIncome);


        input.close();

    }
}
