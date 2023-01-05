package day15_ForLoops;

public class ForLoopPractices2 {
    public static void main(String[] args) {
        for(char ch = 'a';ch<='z'; ch++){
            System.out.print(ch + " ");
        }
        System.out.println("\n");
        for(char ch = 'A'; ch<='Z'; ch++){
            System.out.print(ch + " ");
        }
        System.out.println("\n");
        for (char ch = 'z'; ch>='a'; ch--){
            System.out.print(ch + " ");
        }
        System.out.println("\n");
       for(int i = 90; i>=65 && i<=90; i--){
           System.out.print((char)i + " ");
       }

    }
}
