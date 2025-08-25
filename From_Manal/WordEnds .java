public class WordEnds {

    public static String wordEnds(String str, String word) {
        StringBuilder result = new StringBuilder();
        int wordLen = word.length();
        for (int i = 0; i <= str.length() - wordLen; i++) {
            // Check if word appears at position i
            if (str.substring(i, i + wordLen).equals(word)) {
                // If there is a char before the word, add it
                if (i > 0) {
                    result.append(str.charAt(i - 1));
                }
                // If there is a char after the word, add it
                if (i + wordLen < str.length()) {
                    result.append(str.charAt(i + wordLen));
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY"));  
        System.out.println(wordEnds("XY123XY", "XY"));         
        System.out.println(wordEnds("XY1XY", "XY"));           
    }
}