// String-3 > maxBlock
public class StringBlockAnalyzer {
    public static int longestCharBlock(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int count = 1;
        int max = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }
            if (max < count) {
                max = count;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestCharBlock("hoopla"));
        System.out.println(longestCharBlock("abbCCCddBBBxx"));
        System.out.println(longestCharBlock(""));
    }
}
