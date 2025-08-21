public class WordPreserver {
    public String replaceNonWordWithPlus(String str, String word) {
        StringBuilder finalString = new StringBuilder();
        if (str.contains(word)) {
            for (int i = 0; i < str.length(); i++) {
                if (i <= str.length() - word.length() &&
                    str.substring(i, i + word.length()).equals(word)) {
                    finalString.append(word);
                    i += word.length() - 1;
                } else {
                    finalString.append('+');
                }
            }
        }
        return finalString.toString();
    }
}