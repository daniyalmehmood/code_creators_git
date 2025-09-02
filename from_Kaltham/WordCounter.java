//AP-1 > wordsCount

public class WordCounter {
    public int countWordsOfLength(String[]words, int len) {
        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) {
                sum++;
            }
        }
        return sum;
    }
}