public class RepeatSeparator {
    public String buildRepeatedString(String word, String sep, int count) {
        StringBuilder finalString = new StringBuilder();
        for (int i = count; i > 0; i--) {
            finalString.append(word);
            if (count > 1) {
                finalString.append(sep);
                count--;
            }
        }
        return finalString.toString();
    }
}