package day11_SwitchStatement.homework;

public class Elevator {
    public static void main(String[] args) {
        /*
        2. Create a class called Elevator. A variable named floorNumber is given, write a program
         that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed


         */
        int floorNum = 1;
        String r = "";

        /* sollution 1

        if(floorNum>=1 && floorNum<=3){
            if(floorNum==1){
                r = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
            } else if (floorNum==2) {
                r = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
            }else {
                r = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }
        }else {
            r = "Invalid floor - 6";
        }
        System.out.println(r); */

        /* sollution 2

        switch (floorNum){
            case 1:
                r = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                break;
            case 2:
                r = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                break;
            case 3:
                r = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
                break;
            default:
                r = "Invalid floor - 6";
                break;
        }
        System.out.println(r); */

        if (floorNum >= 1 && floorNum <= 3) {
        switch (floorNum){
            case 1:
                r = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                break;
            case 2:
                r = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                break;
            default:
                r = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
                break;
        }
        } else {
            r = "Invalid floor - 6";
        }
        System.out.println(r);
    }
}
