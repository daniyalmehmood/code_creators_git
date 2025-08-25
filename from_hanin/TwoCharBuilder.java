public class TwoCharBuilder {
    public String lastChars(String a, String b) {
        // If b is empty but a has at least one char, take first char of a + '@'
        if (b.length() == 0 && a.length() >= 1) {
            return a.substring(0, 1) + "@";
        }
        // If a is empty but b has at least one char, take '@' + last char of b
        if (a.length() == 0 && b.length() >= 1) {
            return "@" + b.substring(b.length() - 1);
        }
        // If both a and b are empty, return "@@"
        if (a.length() == 0 && b.length() == 0) {
            return "@@";
        }
        // Normal case: first char of a + last char of b
        return a.substring(0, 1) + b.substring(b.length() - 1);
    }
}
