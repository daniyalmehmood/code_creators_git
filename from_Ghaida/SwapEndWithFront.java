import java.util.Arrays;

public class SwapEndWithFront {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(swapFirstIndexWithLast(new int[]{1, 2, 3, 4})));// → [4, 2, 3, 1]
        System.out.println(Arrays.toString(swapFirstIndexWithLast(new int[]{1, 2, 3})));// → [3, 2, 1]
        System.out.println(Arrays.toString(swapFirstIndexWithLast(new int[]{8, 6, 7, 9, 5})));// → [5, 6, 7, 9, 8]);
    }
    public static int[] swapFirstIndexWithLast(int[] nums) {
        int firstIndex = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = firstIndex;
        return nums;
    }
}
