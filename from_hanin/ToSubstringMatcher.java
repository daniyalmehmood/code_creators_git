public class ToSubstringMatcher {
    public String longestMatchingStartEnd(String string) {
        for (int i = string.length() / 2; i >= 0; i--) { // loop from half down to 0
            String first = string.substring(0, i);
            String end = string.substring(string.length() - i);
            if (first.equals(end)) {
                return first;
            }
        }

        return "";
    }
}
