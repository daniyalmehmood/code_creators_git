import java.util.Arrays;

public class ZerosFirstInArray {//Array-2 > zeroFront
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZerosToFrontOfOnes(new int[]{1, 0, 0, 1})));// → [0, 0, 1, 1]
        System.out.println(Arrays.toString(moveZerosToFrontOfOnes(new int[]{0, 1, 1, 0, 1})));// → [0, 0, 1, 1, 0]1]
        System.out.println(Arrays.toString(moveZerosToFrontOfOnes(new int[]{1, 0}));// → [0, 1]
    }
    public static int[] moveZerosToFrontOfOnes(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[index++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result[index++] = nums[i];
            }
        }
        return result;
    }
}