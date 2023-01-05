package day15_ForLoops;

public class ForLoopPractices {
    public static void main(String[] args) {
        for(int i =23; i >=15 && i<=45; i++){
            System.out.print(i + " ");
        }
        System.out.println("\nAkos");

        for(int i = 65; i<=100 && i>=50; i--){
            System.out.print(i + " ");
        }
        System.out.println("\n-------------------------------------------------");

        for(int i = 1;i <=55; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for(char ch = 'a';ch<='z'; ch++){
            System.out.print(ch + " ");
        }
    }
}
