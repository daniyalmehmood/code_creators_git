public class MaskReplacer {
    public static String plusMaskWithWord(String str, String word) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            if (i <= str.length() - word.length() && str.substring(i, i + word.length()).equals(word)) {
                result.append(word);        // preserve the word
                i += word.length();         // skip over the word
            } else {
                result.append("+");         // replace with '+'
                i++;                        // move one character forward
            }
        }

        return result.toString();
    }


}
