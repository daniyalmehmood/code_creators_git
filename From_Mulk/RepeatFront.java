public class RepeatFront {
    public String buildFrontRepeats(String str, int n) {
        StringBuilder newString = new StringBuilder();
        if (n >= 0 && n <= str.length()) {
            for (int i = 0; i < n; i++) {
                newString.append(str.substring(0, n - i));
            }
        }
        return newString.toString();
    }
}
