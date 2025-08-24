public class WordMasker {
    /**
     * Replaces every character in the string with '+',
     * except for occurrences of the given word which remain unchanged.
     */
    public String maskWithPlusExceptWord(String str, String word) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); ) {
            if (i <= str.length() - word.length() && str.substring(i, word.length() + i).equals(word)) {
                result.append(word);
                i += word.length();
            } else {
                result.append("+");
                i++;
            }
        }
        return result.toString();
    }
}
