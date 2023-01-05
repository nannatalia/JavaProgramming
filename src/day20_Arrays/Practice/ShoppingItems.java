package day20_Arrays.Practice;

public class ShoppingItems {
    public static void main(String[] args) {
        /*
        3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
         */
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        for (int i = 0; i < items.length; i++) {
            String r=items[i];
            if(r.equals("Gloves")){
                System.out.println("The index number of gloves is: " + (i+1));
            }
            if(r.equals("iPad"))
                System.out.println("True");
        }
        for (int i = 0; i < items.length; i++) {
            String r=items[i];
            System.out.println(r + " - " + prices[i] + " - " + itemIDs[i]);
        }
    }
}
