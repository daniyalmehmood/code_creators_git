public class LastTwo {
    public String swapLastTwoChars(String str) {
        if (str.length() > 1) {
            return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
        }
        if (str.length() <= 1) {
            return str;
        } else {
            return "";
        }
    }
}