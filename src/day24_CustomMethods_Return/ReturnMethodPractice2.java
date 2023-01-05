package day24_CustomMethods_Return;

public class ReturnMethodPractice2 {
    public static void main(String[] args) {
        String note= grade(96);
        if(note.equals("A")){
            System.out.println("Excellent");
        } else if (note.equals("B")) {
            System.out.println("Great");
        } else if (note.equals("C")) {
            System.out.println("Good");
        } else if (note.equals("D")) {
            System.out.println("Pass");
        }else {
            System.out.println("Failed");
        }
    }
    public static String grade(int score){
        String result = "";

        if(score < 0 || score > 100){ // Invalid

            result = "Invalid";

        }else{ // valid

            result = (score >= 90) ? "A" :(score >= 80)? "B" :(score >= 70)? "C" :(score >= 60)? "D" : "F";

        }

        return result;
    }
}
