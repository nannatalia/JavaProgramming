package day52_Map_FunctionalInterface;

// lambda:  () -> {}
public class Test {
    public static void main(String[] args) {
        // function1: create a function that can display a number is odd or even
        MyFirstFunctionalInterface oddOrEven = (n) -> {
            if(n%2==0){
                System.out.println(n + " is even number");
            }else{
                System.out.println(n+" is odd number");
            }
        };

        oddOrEven.apply(55);

        // function2: create a function that can check if a person is eligible to buy alcohol
        MyFirstFunctionalInterface eligibleToBuyAlcohol;

        eligibleToBuyAlcohol = (age) -> {
            if(age>=18)
                System.out.println("Is eligible");
            else
                System.out.println("Not eligible");
        };

        eligibleToBuyAlcohol.apply(22);

        //function3: create a function that can display the cube of a number
        MyFirstFunctionalInterface cube;
        cube = (n) -> System.out.println(n*n*n);

        cube.apply(3);

        //function4: create a function that can check if a number is evenly divisble by  3 & 5
        MyFirstFunctionalInterface divisibleBy3And5 = (n) -> {
            if(n % 15 ==0){
                System.out.println(n+" is divisible by 3 and 5");
            }else{
                System.out.println(n+" is not divisible by 3 and 5");
            }
        };

        divisibleBy3And5.apply(30);

    }
}
