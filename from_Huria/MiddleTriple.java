import java.util.Arrays;

public class MiddleTriple {
    public static int[] midThree(int[] nums) {
        int middlen = nums.length / 2;
        int middThree[] = {nums[middlen - 1], nums[middlen], nums[middlen + 1]};
        return middThree;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(midThree(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(midThree(new int[]{8, 6, 7, 5, 3, 0, 9})));
        System.out.println(Arrays.toString(midThree(new int[]{1, 2, 3})));
    }
}