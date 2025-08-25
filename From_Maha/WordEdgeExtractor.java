public class WordEdgeExtractor {
    /**
     * For each occurrence of 'word' in the string,
     * appends the characters immediately before and after it to the result.
     */
    public String getWordEdges(String str, String word) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= str.length() - word.length(); i++) {
            if (str.substring(i, i + word.length()).equals(word)) {
                if (i > 0) { // char before the word
                    result.append(str.charAt(i - 1));
                }
                if (i + word.length() < str.length()) { // char after the word
                    result.append(str.charAt(i + word.length()));
                }
                i += word.length() - 1; // skip the word
            }
        }

        return result.toString();
    }
}
