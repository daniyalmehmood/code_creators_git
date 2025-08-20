public class WordNeighborExtractor {
    public static String wordNeighborExtractor(String str, String word) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            if (i <= str.length() - word.length() && str.substring(i, i + word.length()).equals(word)) {
                if (i > 0) {
                    result.append(str.charAt(i - 1));
                }

                if (i + word.length() < str.length()) {
                    result.append(str.charAt(i + word.length()));
                }
                i += word.length() - 1;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(wordNeighborExtractor("abcXY123XYijk", "XY"));
        System.out.println(wordNeighborExtractor("XY123XY", "XY"));
        System.out.println(wordNeighborExtractor("XY1XY", "XY"));
        System.out.println(wordNeighborExtractor("Hi", "XY"));
        System.out.println(wordNeighborExtractor("abc1xyz1abc", "b"));
    }
}
