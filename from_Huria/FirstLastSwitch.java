import java.util.Arrays;

public class FirstLastSwitch {
    public static int[] swapEnds(int[] nums) {
        if (nums.length >= 1) {
            int first = nums[0];
            nums[0] = nums[nums.length - 1];
            nums[nums.length - 1] = first;
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(swapEnds(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(swapEnds(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(swapEnds(new int[]{8, 6, 7, 9, 5})));
    }
}