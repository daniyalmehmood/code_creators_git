import java.util.Arrays;
public class MakeMiddle {
    public static int[] makeMiddle(int[] nums) {
        int midIndex = nums.length / 2;
        if (nums.length >= 2) {
            return new int[]{nums[midIndex - 1], nums[midIndex]};
        }
        return nums;
    }

            public static void main(String[] args) {
            System.out.println(Arrays.toString(makeMiddle(new int[]{1, 2, 3, 4})));
            System.out.println(Arrays.toString(makeMiddle(new int[]{7, 1, 2, 3, 4, 9})));
            System.out.println(Arrays.toString(makeMiddle(new int[]{1, 2})));
        }
    }