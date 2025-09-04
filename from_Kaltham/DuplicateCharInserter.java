//Recursion-1 > pairStar

public class DuplicateCharInserter {
    public String insertStarBetweenPairs(String str) {
        if (str.length() <= 1) {
            return str;
        }

        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + insertStarBetweenPairs(str.substring(1));
        }

        return str.charAt(0) + insertStarBetweenPairs(str.substring(1));
    }
}