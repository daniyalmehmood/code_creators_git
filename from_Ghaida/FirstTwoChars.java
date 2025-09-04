public class FirstTwoChars {
    public static void main(String[] args) {
        System.out.println(getFirstTwoChars("hello")); //"he"
        System.out.println(getFirstTwoChars("hi")); //"hi"
        System.out.println(getFirstTwoChars("h")); //"h@"
    }
    public static String getFirstTwoChars(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        }
        else if (str.length() == 1) {
            return str + "@";
        }
        else {
            return "@@";
        }
    }
}
