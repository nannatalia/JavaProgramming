package day53_FunctionalInterface;

public class LambdaExpressions {
    public static void main(String[] args) {
        MyThirdFunctionalInterface<String> reverseString = (data) -> {
            String reverse = new StringBuilder(data).reverse().toString();
            return reverse;
        };
        System.out.println(reverseString.method("abc"));
    }
}
