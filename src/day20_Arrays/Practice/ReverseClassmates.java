package day20_Arrays.Practice;

public class ReverseClassmates {
    public static void main(String[] args) {
        /*
        2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
         */
        String[] classmates = {"Kozma Akos", "Anamaria Bostina", "Huseyin Yldirim",
                "Ana Bueno", "Ardelean Vasile", "Kamil Usta", "Andrei Erdei", "Metin Isik",
                "Ali D", "Muhammet Aydin"};

        for (String name : classmates) {
            String result = "";
            for (int j = name.length() - 1; j >= 0; j--) {
                result += name.charAt(j);
            }
            System.out.println(result);
        }
    }
}
