import java.util.Arrays;

public class MaxEndSetter {
    public static int[] maxEndThree(int[] nums) {

        if (nums[0] >= nums[2]) {

            nums[0] = nums[0];
            nums[1] = nums[0];
            nums[2] = nums[0];

        } else {
            nums[0] = nums[2];
            nums[1] = nums[2];
            nums[2] = nums[2];
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxEndThree(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(maxEndThree(new int[]{11, 5, 9})));
        System.out.println(Arrays.toString(maxEndThree(new int[]{2, 2, 2})));
        System.out.println(Arrays.toString(maxEndThree(new int[]{0, 0, 1})));
    }
}