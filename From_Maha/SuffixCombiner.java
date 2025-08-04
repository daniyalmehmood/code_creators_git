public class SuffixCombiner {
    public String combineFromEnd(String firstStr, String secondStr) {
        int minLength = Math.min(firstStr.length(), secondStr.length());
        String firstSuffix = firstStr.substring(firstStr.length() - minLength);
        String secondSuffix = secondStr.substring(secondStr.length() - minLength);
        return firstSuffix + secondSuffix;
    }
}
