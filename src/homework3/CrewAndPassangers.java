package homework3;

public class CrewAndPassangers {
    public static void main(String[] args) {
        /*
        2. Create a class called CrewAndPassangers,
         Given a number of people on the ship (int number),
         determine how many need to be crew members and how many can be passengers.
         Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid
         */
        int n = 75;
        String r = "";
        if(n==50 || n==75 || n==100){
            if(n==50){
                r = "20 crew, 30 passengers";
            } else if (n==75) {
                r = "25 crew, 50 passengers";
            }else {
                r = "30 crew, 70 passengers";
            }
        }else {
            r = "Not valid";
        }
        System.out.println(r);
    }
}
