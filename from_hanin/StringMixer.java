public class StringMixer {
    public String combineString(String a, String b) {
        StringBuilder result = new StringBuilder();
        // Add characters alternately
        for (int i = 0; i < a.length() || i < b.length(); i++) {
            if (i < a.length()) {
                result.append(a.charAt(i));
            }
            if (i < b.length()) {
                result.append(b.charAt(i));
            }
        }
        return result.toString();

    }
}
