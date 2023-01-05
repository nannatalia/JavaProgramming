package day17_While_DoWhile;

public class LoopPractices {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("--------------------------------");
        int n=0 ;
        while(n>=0 && n<=9){
            n++;
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("--------------------------------");
        int k =0;
        do{
            k++;
            System.out.print(k + " ");
        }while(k<=9);
    }
}
