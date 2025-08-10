public class WordNeighbors {
    public String getCharsAroundWord(String str, String word) {
        StringBuilder finalString = new StringBuilder();
        if (str.contains(word)) {
            for (int i = 0; i <= str.length() - word.length(); i++) {
                String part = str.substring(i, i + word.length());
                if (i > 0 && part.equals(word)) {
                    finalString.append(str.charAt(i - 1));
                }
                if (i < str.length() - word.length() && part.equals(word)) {
                    finalString.append(str.charAt(i + word.length()));
                }
            }

        }
        return finalString.toString();
    }
}