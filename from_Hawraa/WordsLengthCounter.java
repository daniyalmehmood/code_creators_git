// AP-1 > wordsCount
public class WordsLengthCounter {
    public int countWordsLength(String[] words, int len) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (len == words[i].length()) {
                count++;
            }
        }
        return count;
    }
}