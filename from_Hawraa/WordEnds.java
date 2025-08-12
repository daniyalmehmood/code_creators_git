public class WordEnds {
    public static String beforeAfterWord(String str, String word) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= str.length() - word.length(); i++) {
            if (str.substring(i, i + word.length()).equals(word)) {
                if (i > 0) {
                    result.append(str.charAt(i - 1));
                }
                if (i + word.length() < str.length()) {
                    result.append(str.charAt(i + word.length()));
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(beforeAfterWord("abcXY123XYijk", "XY"));
        System.out.println(beforeAfterWord("XY123XY", "XY"));
        System.out.println(beforeAfterWord("XY1XY", "XY"));
    }
}
