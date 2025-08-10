public class FirstAndLastCharExtractor {
    public String lastChars(String a, String b) {
        String firstChar = "@";
        String lastChar = "@";
        if (!a.isEmpty()) {
            firstChar = a.substring(0, 1);
        }
        if (!b.isEmpty()) {
            lastChar = b.substring(b.length() - 1);
        }
        return firstChar + lastChar;
    }
}
