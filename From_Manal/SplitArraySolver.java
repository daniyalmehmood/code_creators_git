public class SplitArraySolver {
    public static boolean splitArray(int[] nums, int index, int sum1, int sum2) {
        if (index == nums.length) {
            return sum1 == sum2;
        }

        int current = nums[index];

        if (splitArray(nums, index + 1, sum1 + current, sum2))
            return true;

        if (splitArray(nums, index + 1, sum1, sum2 + current))
            return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(splitArray(new int[]{2, 2}, 0, 0, 0));
        System.out.println(splitArray(new int[]{2, 3}, 0, 0, 0));
        System.out.println(splitArray(new int[]{5, 2, 3}, 0, 0, 0));
    }
}
