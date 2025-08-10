public class StartWordChecker {
    public static String startWord(String str, String word) {
        // Extract a substring from 'str' starting from index 1 up to the length of 'word'
        String newString = str.substring(1, word.length());

        // Extract a substring from 'word' starting from index 1 (excluding the first character)
        String result= word.substring(1, word.length());

        // Store the first character of 'str'
        char first = str.charAt(0);
        if (newString.equals(result)) {
            return first + result;
        }


        // return an empty result
        return "";
    }

}
