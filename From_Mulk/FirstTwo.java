public class FirstTwo {
    public String getFirstTwoChars(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else {
            return str;
        }
    }
}