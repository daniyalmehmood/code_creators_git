import java.util.Arrays;

public class FixerTwoThree {
    public static int[] fixTwoThree(int[] nums) {

        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        }
        if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fixTwoThree(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(fixTwoThree(new int[]{2, 3, 5})));
        System.out.println(Arrays.toString(fixTwoThree(new int[]{1, 2, 1})));
    }
}