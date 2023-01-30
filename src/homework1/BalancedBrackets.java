package homework1;

import java.util.ArrayList;

public class BalancedBrackets {
    public static void main(String[] args) {
        /*
 For compiler one of the most important task is balanced brackets
            * Create a method that will accept a String of brackets. Determine if the brackets are balanced.
            Brackets are balanced if the closing bracket matches the opening one.

            Ex: {([])} -> balanced
                {[(])} -> not balanced

 */
        String str = "{([])}";
        ArrayList<Character> brackets = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            brackets.add(str.charAt(i));
        }

        int size = 0;
        int size2 = 0;

        for (int i = 0; i < brackets.size(); i++) {
            if (brackets.get(i) == '(') {
                size++;
                if (brackets.get(i + 1) != ')') {
                    System.out.println("NO BALANCE1");
                    return;
                } else {
                    size++;
                }
            }
        }

        for (int i = 0; i < brackets.size(); i++) {
            if ((str.substring(str.indexOf('['), str.indexOf(']')).length() != 1)) {
                if (brackets.get(i) == '[') {
                    size2++;
                    if (brackets.get(i + size + 1) != ']') {
                        System.out.println("NO BALANCE2");
                        return;
                    }else{
                        size2++;
                    }
                }
            } else {
                if (brackets.get(i) == '[') {
                    size2++;
                    if (brackets.get(i + 1) != ']') {
                        System.out.println("NO BALANCE3");
                        return;
                    }else{
                        size2++;
                    }
                }
            }
        }
        size2+=size;
        for (int i = 0; i < brackets.size(); i++) {
            if ((str.substring(str.indexOf('{'), str.indexOf('}')).length() != 1)) {
                if((str.substring(str.indexOf('{'), str.indexOf('}')).length() > size2-1)) {
                    if (brackets.get(i) == '{') {
                        if (brackets.get(i + size2 + 1) != '}') {
                            System.out.println("NO BALANCE4");
                            return;
                        }
                    }
                }else {
                    if (brackets.get(i) == '{') {
                        if (brackets.get(i + size + 1) != '}') {
                            System.out.println("NO BALANCE5");
                            return;
                        }
                    }
                }
            } else {
                if (brackets.get(i) == '{') {
                    if (brackets.get(i + 1) != '}') {
                        System.out.println("NO BALANCE6");
                        return;
                    }
                }

            }
        }

                System.out.println(str + " is balanced");
    }
}