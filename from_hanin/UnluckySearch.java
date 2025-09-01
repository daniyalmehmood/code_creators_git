public class UnluckySearch {
    public static boolean hasUnluckyOne(int[] nums) {
        int lengthOfArray = nums.length;

        // Step 1: Check if array length
        if (lengthOfArray >= 2) {

            // Step 2: Check  first two elements are [1, 3]
            if (nums[0] == 1 && nums[1] == 3) {
                return true;
            }

            // Step 3: Check if elements at positions 1 and 2 are [1, 3]
            if (lengthOfArray > 2 && nums[1] == 1 && nums[2] == 3) {
                return true;
            }

        }

        // Step 4: return false
        return false;
    }
}

