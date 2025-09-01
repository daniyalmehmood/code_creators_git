public class DivisibilityChecker {
    public boolean isSelfDividing(int n) {
        String nums = n + "";
        if (nums.contains("0")) {
            return false;
        }
        for (int i = 0; i < nums.length(); i++) {
            if (n % Integer.parseInt(nums.charAt(i) + "") != 0) {
                return false;
            }
        }
        return true;
    }

}
