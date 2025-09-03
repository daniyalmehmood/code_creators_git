import java.util.Arrays;

public class MaxEndArray {
    public static int[] fillWithLargerEnd(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        return new int[]{max, max, max};

    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fillWithLargerEnd(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(fillWithLargerEnd(new int[]{11, 5, 9})));
        System.out.println(Arrays.toString(fillWithLargerEnd(new int[]{2, 11, 3})));
    }
    }
