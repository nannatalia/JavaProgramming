package day24_CustomMethods_Return;

public class ReturnMethodPractice3 {
    public static void main(String[] args) {
        String word = "aabccdee";
        for (int i = 0; i < word.length(); i++) {
            int result = frequency(word,word.charAt(i));
            if(result==1){
                System.out.println(word.charAt(i));
            }
        }

    }
    public static int frequency(String word, char ch) {
        int count = 0;
        for( char each : word.toCharArray()){
            if(each==ch){
                count++;
            }
        }
        return count;
    }
}
