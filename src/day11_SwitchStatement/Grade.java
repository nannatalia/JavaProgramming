package day11_SwitchStatement;

public class Grade {

    public static void main(String[] args) {

        char ch = 'A';
        String r = "";
        switch (ch){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                r = "Passed";
                break;
            default:
                r = "Failed";


        }
        System.out.println(r);
    }
}
