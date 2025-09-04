//Recursion-2 > splitArray


public class EqualPartitionChecker {
    public boolean canSplitArrayIntoEqualSums(int[]nums) {

        return checkPartition(nums, 0, 0, 0);

    }
    public boolean checkPartition(int[]nums, int start, int sumGroupOne, int sumGroupTwo) {
        if (start == nums.length) {
            return sumGroupOne == sumGroupTwo;
        }

        if (checkPartition(nums, start + 1, sumGroupOne + nums[start], sumGroupTwo)) {
            return true;
        }

        if (checkPartition(nums, start + 1, sumGroupOne, sumGroupTwo + nums[start])) {
            return true;
        }
        return false;
    }

}