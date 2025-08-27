public class LongestBlockCalculator {
    public int findLongestRepeatedCharLength(String str) {
        int maxCountBlock = 0;
        int currentCount = 1;
        if (!str.isEmpty()) {
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    currentCount++;
                } else {
                    maxCountBlock = Math.max(maxCountBlock, currentCount);
                    currentCount = 1;
                }
            }
            maxCountBlock = Math.max(maxCountBlock, currentCount);
            return maxCountBlock;
        }
        return 0;
    }
}