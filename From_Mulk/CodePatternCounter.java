public class CodePatternCounter {
    public int countCoXePatterns(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 4).equals("code") ||
                    (str.substring(i, i + 4).startsWith("co") && str.substring(i, i + 4).endsWith("e"))) {
                count++;
            }
        }
        return count;
    }
}