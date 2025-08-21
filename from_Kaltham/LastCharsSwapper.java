public class LastCharsSwapper {
    public String swapLastTwoChars(String str) {
        if (str.length() <= 1) {
            return str;
        }
        char firstChar = str.charAt(str.length() - 1);
        char secondChar = str.charAt(str.length() - 2);
        String newStr = str.substring(0, str.length() - 2);

        return newStr + firstChar + secondChar;
    }
}