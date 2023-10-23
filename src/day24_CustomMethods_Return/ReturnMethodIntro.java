package day24_CustomMethods_Return;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        String str = "Java";

        System.out.println(reverse(str));

        if (str.equalsIgnoreCase(reverse(str))) {
            System.out.println(str + " is palindrom");
        } else {
            System.out.println(str + " is not palindrom");
        }

    }


    public static String reverse(String str) {

        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }
}
