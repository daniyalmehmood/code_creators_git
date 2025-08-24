import java.util.Arrays;

public class ArrayReverser {
    public static int[] reverseThree(int[] nums) {
        int reverse[] = {nums[2], nums[1], nums[0]};
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseThree(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(reverseThree(new int[]{5, 11, 9})));
        System.out.println(Arrays.toString(reverseThree(new int[]{7, 0, 0})));
    }
}
