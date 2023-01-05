package day15_ForLoops;

import java.util.Scanner;

public class Blblblb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= 0;
        double total=0;
        String shopping="";
        while(true){
            n++;
            System.out.println("Enter the name of item " + n);
            String item = input.nextLine();
            System.out.println("Enter the price of the " + item);
            double price = input.nextDouble();
            System.out.println("How many " + item + " will you buy?");
            int nrItems = input.nextInt();
            double totalPriceOfThisItem = nrItems*price;
            System.out.println("Do you want to add more items to the shopping list?");
            String answer = input.next().toLowerCase();
            total+=(price*nrItems);
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid entry, reenter");
                answer = input.next();
            }
            shopping+=item + " x " + nrItems + " - $" + totalPriceOfThisItem +"\n";
            input.nextLine();
            if(answer.equals("no")){
                System.out.println("SHOPPING LIST:");
                System.out.println(shopping);
                System.out.println("Total cost: $" + total);
                break;
            }

        }

    }
}
