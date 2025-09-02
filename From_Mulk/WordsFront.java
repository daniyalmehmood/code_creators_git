//AP-1 > wordsFront
public class WordsFront {
    public String[] getFirstWords(String[] words, int n) {
        String[] newString = new String[n];
        for (int i = 0; i < n; i++) {
            newString[i] = words[i];
        }

        return newString;
    }

}