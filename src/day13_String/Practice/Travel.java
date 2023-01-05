package day13_String.Practice;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        /*
        3. Create a class calledTravel. Make a cost variable to calculate how much
        the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line,
            		separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName. We have charged extra
            		for the $numberOfBags bags but you are traveling with $peopleYouTravelWith
            		 so we are giving a discount. Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years,
        			but not to worry we will get it ready for you to travel to $allCountries.
        			Your total cost has come out to $costAmount."
         */
        Scanner input = new Scanner(System.in);
        double cost =100;
        System.out.println("Do you have a valid passport?");
        String valid = input.next();
        input.nextLine();
        if(valid.equals("Yes")){
            System.out.println("Where do you want to travel?");
            String country = input.nextLine();
            System.out.println("How many bags will you bring?");
            byte bags = input.nextByte();
            cost +=bags*50;
            System.out.println("How many people will you travel with?");
            short people = input.nextShort();
            input.nextLine();
            if(cost>=300){
                cost -= people*100;
            }
            System.out.println("Enter the name of the people you will travel with in one line");
            String names = input.nextLine();
            System.out.println("Your ticket is booked to " + country +". We have charged extra for the " + bags +" bags but you are traveling with " + people + ", " + names + " so we are giving a discount. Your total cost is " + cost);
        } else if (valid.equals("No")) {
            cost =200;
            System.out.println("When did your passport expire?");
            int expiration = input.nextInt();
            int years = 2022-expiration;
            cost +=years*75;
            input.nextLine();
            System.out.println("Where do you want to travel?");
            String country = input.nextLine();
            System.out.println("Will you travel next year?");
            String nextYear = input.next();
            if(nextYear.equals("Yes")){
                cost+=100;
            }else {
                cost -=50;
            }
            System.out.println("Looks like your password has been expired for " + years +" years, but not to worry we will get it ready for you to travel to " +country +". Your total cost has come out to " + cost );
        }
    }
}
