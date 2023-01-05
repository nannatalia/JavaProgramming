package day20_Arrays.Practice;


import java.util.Scanner;

public class blfjfdj {
    public static int getDup(String[] arr) {
        int count = 0;
        String result = "";
        for (String s : arr) {
            for (String i : arr) {
                if(s.equals(i)){
                    count++;
                }
            } if(!(result.contains(s))){
                continue;
            }
            result+=s;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = new String[in.nextInt()];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));
    }

    }
