public class NumberDigitAnalyzer {
    public boolean containsOneDigit(int n) {
        String nums = n + "";
        if (nums.contains("1")) {
            return true;
        }
        return false;
    }

}
