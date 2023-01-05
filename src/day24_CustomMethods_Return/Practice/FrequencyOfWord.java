package day24_CustomMethods_Return.Practice;

public class FrequencyOfWord {
    public static void main(String[] args) {
        /*
        1.  create a method named frequencyOfWord that passes
         two parameters: string sentence and String word, then returns the frequency
         of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
         */
        int result = frequencyOfWord("Java java java python ", "java");
        System.out.println(result);
    }
    public static int frequencyOfWord(String sentence, String word){
        String[] words = sentence.split(" ");
        int count=0;
        String word1 = word;
        for (String s : words) {
            if(s.equalsIgnoreCase(word)){
                count++;
            }
        }return count;
    }
}
