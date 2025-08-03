public class FirstTwoChars {
    public static String firstTwoChars(String str) {
        if (str.length() >= 2) {

            String first = str.substring(0, 2);
            String newString = first;
            return newString;
        } else {
            return str;

        }
    }

    public static void main(String[] args) {
        System.out.println(FirstTwoChars.firstTwoChars("Hello"));
        System.out.println(FirstTwoChars.firstTwoChars("abcdefg"));
        System.out.println(FirstTwoChars.firstTwoChars("ab"));
    }
}
