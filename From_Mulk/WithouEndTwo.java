public class WithouEndTwo {
    public String removeFirstAndLastChar(String str) {
        if (str.isEmpty() || str.length() <= 1) {
            return "";
        } else {
            return str.substring(1, str.length() - 1);
        }
    }
}
