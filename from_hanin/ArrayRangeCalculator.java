//Array-2 > bigDiff
public class ArrayRangeCalculator {
    public int calculateMaxMinDifference(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]); // compares current max to current element
            min = Math.min(min, nums[i]); // compares current min to current element

        }
        return max - min;

    }


}



