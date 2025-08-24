import java.util.Arrays;

public class FirstNWords {//AP-1 > wordsFront

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFrontWords(new String[]{"a", "b", "c", "d"}, 1))); // → [a]
        System.out.println(Arrays.toString(getFrontWords(new String[]{"a", "b", "c", "d"}, 2))); // → [a, b]
        System.out.println(Arrays.toString(getFrontWords(new String[]{"a", "b", "c", "d"}, 3))); // → [a, b, c]
    }
    public static String[] getFrontWords(String[] words, int n) {
        String[] firstNWordsArray = new String[n];
        for (int i = 0; i < n; i++) {
            firstNWordsArray[i] = words[i];
        }
        return firstNWordsArray;
    }
}