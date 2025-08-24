public class UnluckyChecker {

    // This method checks if there's an "unlucky 1" (1 followed by 3) in the first 2 or last 2 elements
    public static boolean hasUnlucky1(int[] nums) {
        int len = nums.length;

        // Check at index 0 and 1
        if (len >= 2 && nums[0] == 1 && nums[1] == 3) {
            return true;
        }

        // Check at index 1 and 2 (just after start)
        if (len >= 3 && nums[1] == 1 && nums[2] == 3) {
            return true;
        }

        // Check the last two elements
        if (len >= 2 && nums[len - 2] == 1 && nums[len - 1] == 3) {
            return true;
        }

        // No unlucky 1 found
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasUnlucky1(new int[] {1, 3, 4, 5}));    // true
        System.out.println(hasUnlucky1(new int[] {2, 1, 3, 4, 5})); // true
        System.out.println(hasUnlucky1(new int[] {1, 1, 1}));       // false
        System.out.println(hasUnlucky1(new int[] {1, 2, 3}));       // false
        System.out.println(hasUnlucky1(new int[] {1, 3}));          // true
    }
}