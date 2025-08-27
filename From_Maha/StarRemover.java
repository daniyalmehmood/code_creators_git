public class StarRemover {
    /**
     * Removes all '*' characters from the string along with
     * the characters immediately next to each '*'.
     */
    public String removeStarsAndNeighbors(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*' ||
                    (i > 0 && str.charAt(i - 1) == '*') ||
                    (i < str.length() - 1 && str.charAt(i + 1) == '*')) {
                continue;
            }
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
