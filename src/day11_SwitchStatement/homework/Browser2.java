package day11_SwitchStatement.homework;

public class Browser2 {
    public static void main(String[] args) {
         /*
         3.  write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be:
             Invalid Browser

        	Do Not use if statement or ternary

          */
        String browserName = "Safari";
        String r = "";
        switch (browserName){
            case "Chrome":
                r =  "Chrome browser is selected";
                break;
            case "Firefox":
                r = "Firefox browser is selected";
                break;
            case "Opera":
                r = "Opera browser is selected";
                break;
            case "Safari":
                r = "Safari browser is selected";
                break;
            case "Edge":
                r = "Edge browser is selected";
                break;
            default:
                r = "Invalid browser name";
        }
        System.out.println(r);
    }
}
