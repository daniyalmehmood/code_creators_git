public class SumTwo {
    public int sumTwo(int[]nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            int sum = nums[0] + nums[1];
            return sum;
        }

    }
}