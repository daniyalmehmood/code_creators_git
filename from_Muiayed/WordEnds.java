public class WordEnds {
    public String wordEnds(String str, String word) {
        StringBuilder out = new StringBuilder();
        int len = word.length();
        int n = str.length();

        for (int i = 0; i <= n - len; i++) {
            if (str.substring(i, i + len).equals(word)) {
                if (i > 0) out.append(str.charAt(i - 1));
                if (i + len < n) out.append(str.charAt(i + len));
            }
        }
        return out.toString();
    }

    public static void main(String[] args) {
        WordEnds we = new WordEnds();
        System.out.println(we.wordEnds("abcXY123XYijk", "XY"));
        System.out.println(we.wordEnds("XY123XY", "XY"));
        System.out.println(we.wordEnds("XY1XY", "XY"));
    }
}