public class StringPatternBuilder {
    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(word);
            // Append separator only between words, not after the last one
            if (i < count - 1) {
                result.append(sep);
            }
        }
        return result.toString();
    }
}
