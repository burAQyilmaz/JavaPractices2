package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {

        String browserName= "chrome";

        String result;

        boolean validBrowser= browserName == "chrome" || browserName == "firefox " || browserName == "opera" || browserName == "safari" || browserName == "edge";

        if(validBrowser){
            if(browserName == "chrome"){
                result = "Chrome Browser is Selected";

            } else if (browserName == "firefox " ) {
                result = "Firefox Browser is Selected";

            }else if (browserName == "opera" ) {
                result = "Chrome Browser is Selected";

            }else if (browserName == "safari") {
                result = "Safari Browser is Selected";

            }else  {
                result = "Edge Browser is Selected";

            }
        }else {
            result = "Invalid Browser Name";
        }
        System.out.println(result);


        /*
3.  write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser
        	Do Not use if statement or ternary
 */
    }
}
