public class PrefixSuffixMatcher {
    public String findMatchingPrefixSuffix(String string) {
        for (int i = string.length() / 2; i > 0; i--) {
            String prefix = string.substring(0, i);
            String sufix = string.substring(string.length() - i);
            if (prefix.equals(sufix)) {
                return prefix;
            }
        }
        return "";

    }
}