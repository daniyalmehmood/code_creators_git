public class SeparatorRepeater {
    public String repeatWithSeparator(String word, String sep, int count) {
        //eturn a big string made of count occurrences of the word, separated by the separator string.
        String newWord = "";
        for (int i = 0; i < count; i++) {
            newWord += word;
            if (i < count - 1) {
                newWord += sep;
            }
        }
        return newWord;
    }
}
