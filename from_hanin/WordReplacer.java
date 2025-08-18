public class WordReplacer {
    public String replaceStandaloneIs(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if ((i - 1 >= 0 && Character.isLetter(str.charAt(i - 1))) ||
                    (i + 2 < str.length() && Character.isLetter(str.charAt(i + 2)))) {
                // If before or after is a letter, just append current char
                result.append(str.charAt(i));
            } else if (i + 1 < str.length() && str.substring(i, i + 2).equals("is")) {
                // Replace "is" with "is not"
                result.append("is not");
                i++; // skip the next char because we processed "is"
            } else {

                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
