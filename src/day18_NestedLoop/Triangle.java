package day18_NestedLoop;

public class Triangle {
    public static void main(String[] args) {
        /*
        Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
         */
        String r = "";
        for (int i = 0; i < 10; i++) {
                r+="* ";
                System.out.println(r);
            }
            System.out.println();
        }
    }

