//Recursion-1 > countPairs


public class MatchingPairsCounter {
    public int findPairs(String str) {
        if (str.length() <= 2) {
            return 0;
        }
        if (str.charAt(0) == str.charAt(2)) {
            return 1 + findPairs(str.substring(1));
        }

        return findPairs(str.substring(1));

    }
}