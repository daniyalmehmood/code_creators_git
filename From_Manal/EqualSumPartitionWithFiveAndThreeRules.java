public class EqualSumPartitionWithFiveAndThreeRules {

    public static boolean splitFiveAndThree(int[] nums, int index, int sum1, int sum2) {
        if (index == nums.length) {
            return sum1 == sum2;
        }

        int current = nums[index];

        if (current % 5 == 0) {
            return splitFiveAndThree(nums, index + 1, sum1 + current, sum2);
        }
        else if (current % 3 == 0) {
            return splitFiveAndThree(nums, index + 1, sum1, sum2 + current);
        }
        else {
            return splitFiveAndThree(nums, index + 1, sum1 + current, sum2) || splitFiveAndThree(nums, index + 1, sum1, sum2 + current);
        }
    }

    public static void main(String[] args) {
        System.out.println(splitFiveAndThree(new int[]{1, 1}, 0, 0, 0));
        System.out.println(splitFiveAndThree(new int[]{1, 1, 1}, 0, 0, 0));
        System.out.println(splitFiveAndThree(new int[]{2, 4, 2}, 0, 0, 0));
    }
}
