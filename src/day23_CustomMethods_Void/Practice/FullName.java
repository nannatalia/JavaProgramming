package day23_CustomMethods_Void.Practice;

public class FullName {
    public static void main(String[] args) {
        full("nAn", "NatALIA");
    }
    public static void full(String first, String second){
        String letter1 = first.charAt(0) + "";
        String letter2 = first.charAt(0) + "";
        String rest = first.substring(1).toLowerCase();
        String rest2 = second.substring(1).toLowerCase();

        System.out.println(letter1.toUpperCase()+rest + " " + letter2.toUpperCase() +rest2);
    }
}
