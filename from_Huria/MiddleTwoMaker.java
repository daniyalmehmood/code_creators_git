import java.util.Arrays;

public class MiddleTwoMaker {
    public static int[] makeMiddle(int[] nums) {
        int middlen = nums.length / 2;
        if (nums.length > 2) {
            int middTwo[] = {nums[middlen - 1], nums[middlen]};
            return middTwo;
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeMiddle(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(makeMiddle(new int[]{7, 1, 2, 3, 4, 9})));
        System.out.println(Arrays.toString(makeMiddle(new int[]{1, 2})));
        System.out.println(Arrays.toString(makeMiddle(new int[]{5, 2, 4, 7})));
    }
}
