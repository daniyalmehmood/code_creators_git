public class RepeatPrefix {
    public String prefixStepRepeat(String str, int n) {
        StringBuilder result = new StringBuilder();
        if (n >= 0 && n <= str.length()) {
            for (int i = n; i > 0; i--) {
                result.append(str.substring(0, i));

            }
        }
        return result.toString();
    }
}