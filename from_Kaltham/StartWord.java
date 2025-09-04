public class StartWord {
    public String startWord(String str, String word) {
        if (str.length() < word.length()) {
            return "";
        }

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) != str.charAt(i)) {
                return "";
            }

        }
        return str.substring(0, word.length());

    }
}