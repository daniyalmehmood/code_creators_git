public class WordsCount {
    public static int wordsCount(String[] words, int len) {
        int cnt = 0;
        for (String w : words) {
            if (w.length() == len) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(wordsCount(new String[]{"a", "bb", "b", "ccc"}, 1));
        System.out.println(wordsCount(new String[]{"a", "bb", "b", "ccc"}, 3));
        System.out.println(wordsCount(new String[]{"a", "bb", "b", "ccc"}, 4));
    }
}