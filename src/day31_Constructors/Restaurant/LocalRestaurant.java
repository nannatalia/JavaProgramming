package day31_Constructors.Restaurant;

public class LocalRestaurant {
    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant("Nan Natalia", "Sacueni", 5);
        Server server1 = new Server("Akos", 221, 32, true);
        Server server2 = new Server("Adri", 333, 23, false);
        Server server3 = new Server("Heni", 443, 43, true);

        Server[] serverss = {server1,server2,server3};

        Chef chef1 = new Chef("Huseyin", 545, 55, true);
        Chef chef2 = new Chef("Ana", 567, 44, false);
        Chef chef3 = new Chef("Sorin", 657, 67, true);

        Chef[] cheffs = {chef1,chef2,chef3};

        restaurant1.hireChef(chef3);
        restaurant1.hireServer(server3);
        restaurant1.hireServer(server1);
        restaurant1.hireChef(chef1);

        System.out.println(restaurant1);
    }
}
