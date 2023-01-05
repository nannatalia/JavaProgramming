package day21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        String[] word= { "Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};
        for (String s : word) {
            System.out.println(s.charAt(0) +""+ s.charAt(s.length()-1));
        }
    }
}
