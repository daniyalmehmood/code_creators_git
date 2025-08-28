import java.util.Arrays;

public class WordsWithout {
    public static String[] wordsWithout(String[] words, String target) {
        int cnt = 0;
        for (String w : words) if (!w.equals(target)) cnt++;
        String[] res = new String[cnt];
        int idx = 0;
        for (String w : words) if (!w.equals(target)) res[idx++] = w;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(wordsWithout(new String[]{"a","b","c","a"}, "a")));
        System.out.println(Arrays.toString(wordsWithout(new String[]{"a","b","c","a"}, "b")));
        System.out.println(Arrays.toString(wordsWithout(new String[]{"a","b","c","a"}, "c")));
    }
}