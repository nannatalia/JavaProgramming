package day20_Arrays.Practice;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class blblbl {

    public static void main(String[] args) {
        String str = method("on the weekend", 20);
        System.out.println(str);
    }

    public static String method(String str, int s) {
        str = str.substring(6);
        if (s < 10) {
            str = str.substring(8);
        } else {
            if (str.length() > s) {
                str = "weekday";
            } else if (s > 10 || s == -10) {
                str = str.substring(5);
            }
        }
        return str;

    }
}
