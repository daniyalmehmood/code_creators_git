// AP-1 > wordsFront
public class WordsArraySelector {
    public String[] getFirstNWords(String[] words, int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = words[i];
        }
        return result;
    }
}