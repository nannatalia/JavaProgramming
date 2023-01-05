package day13_String.Practice;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        /*
2. Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party
and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number)
	(each person = & in output) Check amount: (number)
	Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Split or no split?");
        String split = input.next();
        System.out.println("Enter the number of people");
        int nr = input.nextInt();
        System.out.println("Enter the check amount");
        double check = input.nextDouble();
        System.out.println("How was the service quality?");
        String service= input.next();
        double total, tip, totalPerPers, tipPerPers;
        if(split.equals("Yes")){
            if(service.equals("Poor")){
                tip = (check*5)/100;
            } else if (service.equals("Fair")) {
                tip = (check*10)/100;
            } else if (service.equals("Good")) {
                tip = (check*15)/100;
            } else if (service.equals("Great")) {
                tip = (check*20)/100;
            }else {
                tip= (check*25)/100;
            }
            total = tip + check;
            totalPerPers=total/nr;
            tipPerPers = tip/nr;
            System.out.println("Number of people entered: " +nr);
            System.out.println("Total to pay: "+ total);
            System.out.println("Total tip: "+ tip);
            System.out.println("Total per person: "+totalPerPers);
            System.out.println("Tip per person: " + tipPerPers);
        }else {
            if(service.equals("Poor")){
                tip = (check*5)/100;
            } else if (service.equals("Fair")) {
                tip = (check*10)/100;
            } else if (service.equals("Good")) {
                tip = (check*15)/100;
            } else if (service.equals("Great")) {
                tip = (check*20)/100;
            }else {
                tip= (check*25)/100;
            }
            total = tip + check;
            System.out.println("Total to pay: "+ total);
            System.out.println("Total tip: "+ tip);
        }
    }
}
