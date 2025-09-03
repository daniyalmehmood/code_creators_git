import java.util.Arrays;

public class ExtractMiddleTwo {
    public static int[] getMiddleTwo(int[] nums) {
        int mid = nums.length / 2;
        return new int[] {nums[mid -1], nums[mid]};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getMiddleTwo(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(getMiddleTwo(new int[]{7, 1, 2, 3, 4, 9})));
        System.out.println(Arrays.toString(getMiddleTwo(new int[]{1, 2})));
    }
}