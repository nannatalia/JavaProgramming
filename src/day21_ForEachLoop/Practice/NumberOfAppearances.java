package day21_ForEachLoop.Practice;

public class NumberOfAppearances {
    public static void main(String[] args) {
        /*
        6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)
         */
        String str = "Java Python Java Python";
        String[] result = str.split(" ");
        int countJava = 0;
        int countPython = 0;
        for (String s : result) {
            if(s.equals("Java")){
                countJava++;
            }
            if(s.equals("Python")){
                countPython++;
            }
        }
        System.out.println("The number of Java is " + countJava);
        System.out.println("The number of Python is " + countPython);
    }
}
