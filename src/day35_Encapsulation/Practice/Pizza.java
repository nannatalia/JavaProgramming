package day35_Encapsulation.Practice;

public class Pizza {
    /*
    5. Pizza Task:
		5.1 Create class named Pizza:

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)
				Methods:
					calcCost(): returns the totalCost of the pizza
					toString():returns a String containing the pizza size,
					quantity of each topping, and the pizza cost as calculated by calcCost()
		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping


     */
    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setSize(String size) {
        if(!(size.equals("S") || size.equals("M") ||size.equals("L"))){
            System.exit(0);
        }
        this.size = size;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if(numberOfCheeseTopping<0){
            System.exit(0);
        }
        if(size.equals("S")){
            numberOfCheeseTopping=3;
        }
        if(size.equals("M")){
            numberOfCheeseTopping=4;
        }
        if(size.equals("L")){
            numberOfCheeseTopping=5;
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if(numberOfPepperoniTopping<0){
            System.exit(0);
        }
        if(size.equals("S")){
            numberOfPepperoniTopping=4;
        }
        if(size.equals("M")){
            numberOfPepperoniTopping=5;
        }
        if(size.equals("L")){
            numberOfPepperoniTopping=6;
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
    public int calcCost(){
        int cost = 0;
        if(size.equals("S")){
            cost+=10 + 2*(numberOfCheeseTopping+numberOfPepperoniTopping);
        } else if (size.equals("M")) {
            cost+=12 + 2*(numberOfCheeseTopping+numberOfPepperoniTopping);
        } else {
            cost+= 14 + 2*(numberOfCheeseTopping+numberOfPepperoniTopping);
        }
        return cost;
    }
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberofCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping + ", totalCost= $" +
                '}';
    }
}
