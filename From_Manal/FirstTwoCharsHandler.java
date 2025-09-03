public class FirstTwoCharsHandler {
    public static String getFirstTwoCharsPadding(String str) {
        //if the string has two or more caracter, return the first two character
        if (str.length() >= 2) {
            return str.substring(0, 2);
        }
        //if the string has one character, add "@"
        else if (str.length() == 1) {
            return str + "@";
        }
        else {
            //if it is empty, return "@@"
            return "@@";
        }
    }
    public static void main(String[] args) {
        System.out.println(getFirstTwoCharsPadding("hello"));
        System.out.println(getFirstTwoCharsPadding("hi"));
        System.out.println(getFirstTwoCharsPadding("h"));
    }
    }
