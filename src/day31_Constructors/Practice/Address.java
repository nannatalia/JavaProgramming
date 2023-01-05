package day31_Constructors.Practice;

public class Address {
    public long buildingNumber, zipCode;
    public String street, city, state;

    public Address(long buildingNumber, long zipCode, String street, String city, String state) {
        this.buildingNumber = buildingNumber;
        this.zipCode = zipCode;
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String toString() {
        return buildingNumber + " " + street + "\n" + city + " " + state + ", " + zipCode;
    }
}
