package day35_Encapsulation.Practice;

public class Item {
    /*
    4. Item Task
		4.1create a class called Item
	            private variables:
	            	name, unitPrice, quantity
            	Encapsulate all the fields:
            		Conditions:

            			u
            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)
            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
     */
    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setQuantity(quantity);
        setUnitPrice(unitPrice);
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank() || !name.contains(' ' + "")) {
            for (char i = 'a'; i < 'z'; i++) {
                if (!name.startsWith(i + "")) {
                    System.exit(0);
                }
            }
            for (char i = 'A'; i < 'Z'; i++) {
                if (!name.startsWith(i + "")) {
                    System.exit(0);
                }
            }
            System.exit(0);
        }
        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice<=0){
            System.exit(0);
        }
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        if(quantity<=0){
            System.exit(0);
        }
        if(name.equals("toilet paper")){
            quantity=1;
        }
        this.quantity = quantity;
    }
    public String calcCost(){
        return "$" + unitPrice*quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity + "total price= " + calcCost() +
                '}';
    }
}

