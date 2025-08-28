import java.util.Arrays;

public class WordsFront {
    public static String[] wordsFront(String[] words, int n) {
        String[] out = new String[n];
        for (int i = 0; i < n; i++) {
            out[i] = words[i];
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(wordsFront(new String[]{"a","b","c","d"}, 1)));
        System.out.println(Arrays.toString(wordsFront(new String[]{"a","b","c","d"}, 2)));
        System.out.println(Arrays.toString(wordsFront(new String[]{"a","b","c","d"}, 3)));
    }
}