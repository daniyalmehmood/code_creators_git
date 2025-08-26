public class SurroundingCharsExtractor {
    public static String getCharsAroundWord(String str, String word) {
        StringBuilder result = new StringBuilder(); // initialize a string builder to store the result
        for (int i = 0; i < str.length(); i++) { //use a for loop to go through the 'str'
            if (i <= str.length() - word.length() && str.substring(i, i + word.length()).equals(word)) {  // Check if from current position 'i' we have enough characters to match 'word' and if the substring starting at 'i' matches the 'word'
                if (i > 0) { // while 'i' is not 0
                    result.append(str.charAt(i - 1)); // add char before the current index from 'str' to result
                }
                if (i + word.length() < str.length()) { // If there is a character after the found word
                    result.append(str.charAt(i + word.length())); // add chars after the current index from 'str' to result
                }
                i += word.length() - 1; // move index i more to the last index of 'word'
            }
        }
        return result.toString();// return result after converted to string
    }
    public static void main(String[] args) {
        System.out.println(getCharsAroundWord("abcXY123XYijk", "XY"));
    }
}
