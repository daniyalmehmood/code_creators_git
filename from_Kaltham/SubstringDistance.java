//Recursion-1 > strDist

public class SubstringDistance {
    public int longestSubWithEnds(String str, String sub) {
        int lengthOfSub = sub.length();

        if (str.length() < lengthOfSub) {
            return 0;
        }

        if (str.startsWith(sub) && str.endsWith(sub)) {
            return str.length();
        }

        if (!str.startsWith(sub)) {
            return longestSubWithEnds(str.substring(1), sub);
        }

        return longestSubWithEnds(str.substring(0, str.length() - 1), sub);

    }
}