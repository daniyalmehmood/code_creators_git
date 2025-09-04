//Recursion-2 > split53

public class SplitFiveThree {
    public boolean canSplitFiveThree(int[]nums) {

        return partitionHelper(nums, 0, 0, 0);

    }

    public boolean partitionHelper(int[]nums, int start, int sumGroupOne, int sumGroupTwo) {
        if (start == nums.length) {
            return sumGroupOne == sumGroupTwo;
        }

        if (nums[start] % 5 == 0 && nums[start] % 3 != 0) {
            return partitionHelper(nums, start + 1, sumGroupOne + nums[start], sumGroupTwo);
        }

        if (nums[start] % 3 == 0 && nums[start] % 5 != 0) {
            return partitionHelper(nums, start + 1, sumGroupOne, sumGroupTwo + nums[start]);
        }
        if (partitionHelper(nums, start + 1, sumGroupOne + nums[start], sumGroupTwo)) {
            return true;
        }

        if (partitionHelper(nums, start + 1, sumGroupOne, sumGroupTwo + nums[start])) {
            return true;
        }
        return false;

    }

}