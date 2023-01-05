package homework3;

public class BiggerNum {
    public static void main(String[] args) {
        /*
        5. Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
         */
        int n1 = 34,
                n2 = 45,
                n3 = 56;
        String r = "";
        if(n1>n2 && n1>n3){
          r = "N1 is bigger";
        } else if (n2>n1 && n2>n3) {
            r = "N2 is bigger";
        }else {
            r = "N3 is bigger";
        }
        System.out.println(r);
    }
}
