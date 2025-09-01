public class StarCharacterChecker {
    /**
     * Checks if every '*' in the string has the same character
     * before and after it. Returns true if all such cases match.
     */
    public boolean hasSameStarNeighbors(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i + 1) == '*') {
                if (str.charAt(i) != str.charAt(i + 2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
