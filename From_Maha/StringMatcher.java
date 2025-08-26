//String-3 > sameEnds
public class StringMatcher {
    public String longestSamePrefixSuffix(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= input.length() / 2; i++) {
            String start = input.substring(0, i);
            String end = input.substring(input.length() - i);
            if (start.equals(end)) {
                result = new StringBuilder(start);
            }
        }
        return result.toString();
    }
}
