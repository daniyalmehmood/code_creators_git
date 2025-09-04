//Recursion-2 > splitOdd10

public class OddAndTenSplitter {
    public boolean canSplitWithOddAndMultipleOfTen(int[]nums) {
        return tryPartition(nums, 0, 0, 0);

    }

    public boolean tryPartition(int[]nums, int start, int sumGroupOne, int sumGroupTwo) {
        if (start == nums.length) {
            return sumGroupOne % 10 == 0 && sumGroupTwo % 2 != 0;
        }
        if (tryPartition(nums, start + 1, sumGroupOne + nums[start], sumGroupTwo)) {
            return true;
        }

        if (tryPartition(nums, start + 1, sumGroupOne, sumGroupTwo + nums[start])) {
            return true;
        }
        return false;

    }
}