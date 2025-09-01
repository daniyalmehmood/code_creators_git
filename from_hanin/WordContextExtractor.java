public class WordContextExtractor {
    public String wordEnds(String str, String word) {
        StringBuilder result = new StringBuilder();
        int length = word.length();

        for (int i = 0; i <= str.length() - length; i++) {
            // Check if the word matches starting at index i
            if (str.substring(i, i + length).equals(word)) {
                if (i > 0) {
                    result.append(str.charAt(i - 1));
                }
                // Char after the word (if exists)
                if (i + length < str.length()) {
                    result.append(str.charAt(i + length));
                }
            }
        }

        return result.toString();
    }

}
