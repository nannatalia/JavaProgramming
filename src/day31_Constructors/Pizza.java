package day31_Constructors;

public class Pizza {
    /*

		Actions:
			calcCost(): returns the totalCost of the pizza
			toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping


     */
    public String size;
    public int numberofCheeseTopping, numberOfPepperoniTopping;

    public Pizza(String size, int numberofCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberofCheeseTopping = numberofCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
    public int calcCost(){
        int cost = 0;
        if(size.equals("S")){
            cost+=10 + 2*(numberofCheeseTopping+numberOfPepperoniTopping);
        } else if (size.equals("M")) {
            cost+=12 + 2*(numberofCheeseTopping+numberOfPepperoniTopping);
        } else {
            cost+= 14 + 2*(numberofCheeseTopping+numberOfPepperoniTopping);
        }
        return cost;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberofCheeseTopping=" + numberofCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping + ", totalCost= $" +
                '}';
    }
}
