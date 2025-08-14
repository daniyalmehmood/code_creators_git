import java.util.Arrays;

public class FirstLastExtractor {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(firstAndLast(new int[]{1, 2, 3})));// → [1, 3]
        System.out.println(Arrays.toString(firstAndLast(new int[]{1, 2, 3, 4})));// → [1, 4]
        System.out.println(Arrays.toString(firstAndLast(new int[]{7, 4, 6, 2})));// → [7, 2]
    }
    public static int[] firstAndLast(int[] nums) {
        return new int[] {nums[0], nums[nums.length -1]};
    }
}
