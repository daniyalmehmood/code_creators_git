import java.util.Arrays;

public class SwapEnds {
    public static int[] swapEnds(int[] nums) {
        int firstElement = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = firstElement;
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(swapEnds(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(swapEnds(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(swapEnds(new int[]{8, 6, 7, 9, 5})));
    }
}
