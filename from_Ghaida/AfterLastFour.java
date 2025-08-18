import java.util.Arrays;

public class AfterLastFour {//Array-2 > post4
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getElementsAfterFour(new int[]{2, 4, 1, 2})));// → [1, 2]
        System.out.println(Arrays.toString(getElementsAfterFour(new int[]{4, 1, 4, 2})));// → [2]
        System.out.println(Arrays.toString(getElementsAfterFour(new int[]{4, 4, 1, 2, 3})));// → [1, 2, 3]
    }
    public static int[] getElementsAfterFour(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                int[] result = new int[nums.length - i - 1];
                for (int j = 0; j < result.length; j++) {
                    result[j] = nums[i + 1 + j];
                }
                return result;
            }
        }
        return new int[0];
    }
}