// This class to sum the first two elements of an array
public class FirstTwoSumCalculator {
    public static int sumFirstTwo(int[] nums) {
        if (nums.length >= 2) {
            return nums[0] + nums[1];
        }
        if (nums.length == 1) {
            return nums[0];
        }

        return 0;
    }

}
