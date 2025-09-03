//Array-2 > evenOdd Task

import java.util.Arrays;

public class ZeroFront {

    public static int[] zeroFront(int[] nums) {
        int[] result = new int[nums.length];
        int zeroIndex = 0;

        // Index to place zeros from the start
        int nonZeroIndex = nums.length - 1;  // Index to place non-zero numbers from the end

        for (int num : nums) {
            if (num == 0) {
                result[zeroIndex] = 0;
                zeroIndex++;
            } else {
                result[nonZeroIndex] = num;
                nonZeroIndex--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(zeroFront(new int[]{1, 0, 0, 1})));
        System.out.println(Arrays.toString(zeroFront(new int[]{0, 1, 1, 0, 1})));
        System.out.println(Arrays.toString(zeroFront(new int[]{1, 0})));
        System.out.println(Arrays.toString(zeroFront(new int[]{0, 0, 1, 2})));
    }
}