package day11_SwitchStatement;

public class Browser {
    public static void main(String[] args) {
        /*
        1. Create a class called Browser. Write a program that can display
the name of selected browser
        1. declear a String variable named browserName
        2. Assume that the valid browsers are: chrome,
firefox, opera, safari, edge
        3. if the browser name does not match with the
valid browsers' names,
        out put should be: Invalid Browser Name
        Ex:
        String browser = "chrome";
    Output:
    Chrome Browser is selected
         */
        String browserName = "Asf";
        String b = "";
        if(browserName=="Chrome" || browserName=="Firefox" || browserName=="Opera" || browserName=="Safari" || browserName=="Edge"){
            if(browserName=="Chrome"){
                b = "Chrome browser is selected";
            } else if (browserName=="Firefox") {
                b = "Firefox browser is selected";
            } else if (browserName=="Opera") {
                b = "Opera browser is selected";
            } else if (browserName=="Safari") {
                b = "Safari browser is selected";
            }else {
                b = "Edge browser is selected";
            }
        }else {
            b = "Invalid Browser Name";
        }
        System.out.println(b);
    }
}
