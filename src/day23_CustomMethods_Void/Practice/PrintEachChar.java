package day23_CustomMethods_Void.Practice;

public class PrintEachChar {
    public static void main(String[] args) {
        printEachChar("NatiAkica");
    }
    public static void printEachChar(String word){
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i) + " ");
        }
    }

}
