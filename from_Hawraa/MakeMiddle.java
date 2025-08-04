import java.util.Arrays;

public class MakeMiddle {
    public static int[] makeMiddle(int[] nums) {
        int middleArray[] = new int[2];
        if (nums.length % 2 == 0) {
            middleArray[0] = nums[(nums.length / 2) - 1];
            middleArray[1] = nums[nums.length / 2];
        }
        return middleArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeMiddle(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(makeMiddle(new int[]{7, 1, 2, 3, 4, 9})));
        System.out.println(Arrays.toString(makeMiddle(new int[]{1, 2})));
    }
}
