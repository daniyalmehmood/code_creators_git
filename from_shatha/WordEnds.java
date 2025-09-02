public class WordEnds {
    public static String getCharsAroundWord(String str, String word) {
        StringBuilder result = new StringBuilder();
        int wordLen = word.length();

        for (int i = 0; i <= str.length() - wordLen; i++) {
            if (str.startsWith(word, i)) {
                if (i > 0) {
                    result.append(str.charAt(i - 1));
                }
                if (i + wordLen < str.length()) {
                    result.append(str.charAt(i + wordLen));
                }
            }
        }

        return result.toString();

    }
    public static void main (String[]args){
        System.out.println(getCharsAroundWord("abcXY123XYijk", "XY"));
        System.out.println(getCharsAroundWord("XY123XY", "XY") );
        System.out.println(getCharsAroundWord("XY1XY", "XY"));
    }

}
