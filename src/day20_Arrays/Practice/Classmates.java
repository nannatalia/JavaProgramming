package day20_Arrays.Practice;

public class Classmates {
    public static void main(String[] args) {
        /*
        1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
         */
        String[] classmates = {"Kozma Akos", "Anamaria Bostina", "Huseyin Yldirim", "Ana Bueno", "Ardelean Vasile", "Kamil Usta", "Andrei Erdei", "Metin Isik", "Ali D", "Muhammet Aydin"};
        for (String className : classmates) {
            String initials = "";
            for (int j = 0; j < className.length(); j++) {
                initials = "" + className.charAt(0) + "." + className.charAt(className.indexOf(" ") + 1) + ".";
            }
            System.out.println(initials);
        }
    }
}
