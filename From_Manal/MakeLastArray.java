import java.util.Arrays;

public class MakeLastArray {
    public static int[] doubleLengthWithTheLast(int[] nums) {
        int[] result = new int[nums.length * 2];
        result[result.length - 1] = nums[nums.length -1];
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(doubleLengthWithTheLast(new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(doubleLengthWithTheLast(new int[]{1, 2})));
        System.out.println(Arrays.toString(doubleLengthWithTheLast(new int[]{3})));
    }
    }
