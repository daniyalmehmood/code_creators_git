import java.util.Arrays;

public class ReplacingAllZerosAtFront {
    public static int[] moveZerosToFront(int[] nums) {
        int theResult[] = new int[nums.length];
        int zeroIndex = 0;
        int notZeroIndex = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                theResult[zeroIndex] = 0;
                zeroIndex++;
            }
            if (nums[i] != 0) {
                theResult[notZeroIndex] = nums[i];
                notZeroIndex--;
            }
        }
        return theResult;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZerosToFront(new int[]{1, 0, 0, 1})));
        System.out.println(Arrays.toString(moveZerosToFront(new int[]{0, 1, 1, 0, 1})));
        System.out.println(Arrays.toString(moveZerosToFront(new int[]{1, 0})));
    }
}