package day17_While_DoWhile;

public class Frequency {
    public static void main(String[] args) {
        String str = "Java Java Python";
        int frequency = 0;
        while(str.contains("Java")){
           str =  str.replaceFirst("Java", "");
            frequency++;
        }
        System.out.println(frequency);

        System.out.println("---------------------------------------------------");
        String str2 = "Cat Dog Dog Cat Cat Dog Cat";
        int frequency2 = 0;
        int frequency3 = 0;
        while(str2.contains("Dog")){
            str2 = str2.replaceFirst("Dog", "");
            frequency2++;
        }
        while(str2.contains("Cat")){
            str2 = str2.replaceFirst("Cat","");
            frequency3++;
        }
        System.out.println("Dog : " + frequency2);
        System.out.println("Cat: " + frequency3);
    }
}
