package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        /* 1. Create a class called ShippingAddress.java
2. Declare the following variables:
1.name
2.buildingNumber
3.streetName
4.city
5.state
6.zipCode
3. Use concatenation to print the full address */
        String name = "Nan Natalia",
                buildingNumber = "12334B",
                 streetName = "Garii",
                 city = "Sacueni",
                 state = "BH",
                 zipCode = "417435C";

      //  System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode);

        String shippingAddress = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;
        System.out.println(shippingAddress);


    }
}
