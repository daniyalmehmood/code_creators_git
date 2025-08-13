public class FrontNumberChecker {
    public static boolean hasNineInFirstFour(int[] nums) {
            // Loop up to the smaller of nums.length  4
            for (int i = 0; i < Math.min(nums.length, 4); i++) {
                if (nums[i] == 9) {
                    return true;  // Found a 9 in the first four elements
                }
            }
            return false;  // No 9 found in first four elements
        }
    }


