//Recursion-1 > pairStar
public class PairStar {

    // Recursive method to insert '*' between identical adjacent characters
    public static String insertStarsBetweenPairs(String text) {
        //  if string has length 0 or 1, nothing to insert
        if (text.length() <= 1) {
            return text;
        }

        // If the first two characters are the same, insert '*'
        if (text.charAt(0) == text.charAt(1)) {
            return text.charAt(0) + "*" + insertStarsBetweenPairs(text.substring(1));
        } else {
            // Otherwise, keep the first character and recurse on the rest
            return text.charAt(0) + insertStarsBetweenPairs(text.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(insertStarsBetweenPairs("hello"));
        System.out.println(insertStarsBetweenPairs("xxyy"));
        System.out.println(insertStarsBetweenPairs("aaaa"));
    }
}