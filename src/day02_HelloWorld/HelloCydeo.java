package day02_HelloWorld;

import java.util.ArrayList;
import java.util.Scanner;

public class HelloCydeo {


    public static boolean hunt(ArrayList<String> result,int wayStones,int boast) {
        boolean res=false;
        int nr = wayStones;
        int frequencyOfNanuk = 0;
        int sum = 0;
        for (String s : result) {

            if (s.equals("nanuk")) {
                frequencyOfNanuk++;
            } else {
                int nums = Integer.parseInt(s);
                sum += nums;
            }
        }
            if((frequencyOfNanuk<=nr || frequencyOfNanuk==0) && (sum>=boast)){
                    res=true;

            }
        return res;
    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int stones = in.nextInt();
        int boast = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(hunt(list, stones, boast));

    }


}
