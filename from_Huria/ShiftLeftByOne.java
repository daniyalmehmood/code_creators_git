import java.util.Arrays;

public class ShiftLeftByOne {
    public static int[] rotateLeft(int[] nums) {

        if (nums.length == 0) {
            return nums;
        }
        int firstNumber= nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }


        nums[nums.length - 1] = firstNumber ;

        return nums;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateLeft(new int[]{6, 2, 5, 3})));
        System.out.println(Arrays.toString(rotateLeft(new int[]{1, 2})));
        System.out.println(Arrays.toString(rotateLeft(new int[]{1})));

    }
}
