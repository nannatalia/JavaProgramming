package day17_While_DoWhile.Practice;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        /*
        6. Create a class called InsuranceQuote, write a program that can calculate
         the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter
    			until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter
					until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter
					until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter
					until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until
					user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until
					user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount
         */
        double price = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("Enter your gender:");
        String gender = input.next().toLowerCase();
        while(!(gender.equals("male") || gender.equals("female"))){
            System.err.println("Invalid answer, reenter:");
            System.out.println("Enter your gender:");
           gender = input.next().toLowerCase();
        }
        System.out.println("Are you married?");
        String married = input.next().toLowerCase();
        while(!(married.equals("yes") || married.equals("no"))){
            System.err.println("Invalid answer, reenter:");
            System.out.println("Are you married?");
            married = input.next().toLowerCase();
        }
        System.out.println("Enter your age:");
        int age = input.nextInt();
        while (!(age>=1 && age<=120)){
            System.err.println("Invalid answer, reenter:");
            System.out.println("Enter your age:");
            age = input.nextInt();
        }
        System.out.println("How many miles do you drive in a day?");
        int miles = input.nextInt();
        while(!(miles>5)){
            System.err.println("Invalid answer, reenter:");
            System.out.println("How many miles do you drive in a day?");
            miles = input.nextInt();
        }
        input.nextLine();
        System.out.println("Do you want a full coverage or liability insurance?");
        String insurance = input.nextLine().toLowerCase();

        System.out.println("Had you had any accidents or claims in past 5 years?");
        String accident = input.next().toLowerCase();
        while(!(accident.equals("yes") || accident.equals("no"))){
            System.err.println("Invalid answer, reenter:");
            System.out.println("Had you had any accidents or claims in past 5 years?");
            accident = input.next().toLowerCase();
        }
        System.out.println("Does your car have an anti theft device?");
        String theft = input.next().toLowerCase();
        while(!(theft.equals("yes") || theft.equals("no"))) {
            System.err.println("Invalid answer, reenter:");
            System.out.println("Does your car have an anti theft device?");
            theft = input.next();
        }
        if(insurance.equals("full coverage")){
            if(age <25){
                price += 160;
            }else {
                price += 120;
            }
            if(miles<=10){
                price += 20;
            }else if(price > 10 && price<=50){
                price += 40;
            }else {
                price += 70;
            }
        }else {
            if(age <25){
                price += 90;
            }else {
                price += 50;
            }
            if(miles<=10){
                price += 10;
            }else if(miles > 10 && miles<=50){
                price +=30;
            }else {
                price += 50;
            }
        }
        if(theft.equals("yes")){
            price = price - (price*0.05);
        }
        if(accident.equals("yes")){
            price = price + (price *0.15);
        }else {
            price = price - (price*0.1);
        }

        if(married.equals("yes")){
            price = price - (price*0.05);
        }
        System.out.println("The price is: " + price);
    }
}
