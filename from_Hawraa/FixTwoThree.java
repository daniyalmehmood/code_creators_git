import java.util.Arrays;

public class FixTwoThree {
    public static int[] FixTwoThree(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        } else if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(FixTwoThree(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(FixTwoThree(new int[]{2, 3, 5})));
        System.out.println(Arrays.toString(FixTwoThree(new int[]{1, 2, 1})));
    }
}
