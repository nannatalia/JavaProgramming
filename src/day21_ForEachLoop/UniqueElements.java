package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {
        String[] word = {"Java" , "Java", "Python", "Python", "C#", "ABC"};

        for (String s : word) {
            int frequency = 0;
            for (String s1 : word) {
                if(s1.equals(s))
                    frequency++;
            }if(frequency==1){
                System.out.println(s);
            }

        }
    }
}
