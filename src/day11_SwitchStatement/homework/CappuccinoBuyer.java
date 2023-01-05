package day11_SwitchStatement.homework;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        /*
        1. Create a class called  CappuccinoBuyer. A variable named Size is given, 
        write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall: 
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
         */
        String size = "Grande";
        String r = "";

        /*solution 1

        if(size=="Tall" || size == "Grande" || size == "Venti"){
            if(size=="Tall"){
                r = "price is $3.69; \n90 calories";
            } else if (size=="Grande") {
                r = "price is $3.99; \n120 calories";
            }else {
                r = "price is $4.29; \n150 calories";
            }
        }else {
            r = "Invalid size";
        }
        System.out.println(r); */

        /* solution 2

        switch (size){
            case "Tall":
                r = "price is $3.69; \n90 calories";
                break;
            case "Grande":
                r = "price is $3.99; \n120 calories";
                break;
            case "Venti":
                r = "price is $4.29; \n150 calories";
                break;
            default:
                r = "Invalid size";
                break;
        }
        System.out.println(r); */

        //sollution 3

        if(size=="Tall" || size == "Grande" || size == "Venti"){
            switch (size){
                case "Tall":
                    r = "price is $3.69; \n90 calories";
                    break;
                case "Grande":
                    r = "price is $3.99; \n120 calories";
                    break;
                default:
                    r = "price is $4.29; \n150 calories";
                    break;
            }
        }else {
            r = "Invalid size";
        }
        System.out.println(r);
    }
}
