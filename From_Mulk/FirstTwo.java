public class FirstTwo {
    public String getFirstTwoCharacters(String str) {
        if (str.isEmpty()) {
            return "";
        } else if (str.length() >= 2) {
            return str.substring(0, 2);
        } else {
            return str;
        }
    }
}