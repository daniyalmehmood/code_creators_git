public class EndUp {
    public static String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        } else {
            String lastThreeChar = str.substring(str.length() - 3);
            String firstChars = str.substring(0, str.length() - 2);
            String toUpperCase = lastThreeChar.toUpperCase();
            return firstChars + toUpperCase;
        }
    }
}
