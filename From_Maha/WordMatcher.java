public class WordMatcher {
    public String matchStartCharacters(String str, String word) {
        String result = "";
        if (!word.isEmpty() && str.substring(0, 1).equals(word.substring(0, 1))) {
            result += str.substring(0, 1);
        }
        if (word.length() >= 2 && str.substring(1, 2).equals(word.substring(1, 2))) {
            result += str.substring(1, 2);
        }
        if (word.length() >= 3 && str.substring(2, 3).equals(word.substring(2, 3))) {
            result += str.substring(2, 3);
        }
        return result;
    }
}
