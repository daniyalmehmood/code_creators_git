import java.util.Arrays;

public class FirstAndLastSwapper {
    public static int[] swapFirstAndLastElements(int[] nums) {
        int temp = nums[0];
        nums[0] =nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(swapFirstAndLastElements(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(swapFirstAndLastElements(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(swapFirstAndLastElements(new int[]{8, 6, 7, 9, 5})));
    }
}
