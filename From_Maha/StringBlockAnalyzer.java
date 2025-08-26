//String3-MaxBlock
public class StringBlockAnalyzer {
    public int longestConsecutiveBlock(String str) {
        int currentCount = 1;
        int maxCount = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                currentCount++;
            } else currentCount = 1;
            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        }
        return maxCount;
    }
}
