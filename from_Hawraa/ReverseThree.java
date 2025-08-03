import java.util.Arrays;

public class ReverseThree {
    public static int[] reverseThree(int[] nums) {
        int[] reversed = new int[3];
        for (int i = 0; i < nums.length; i++) {
            reversed[i] = nums[nums.length - 1 - i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseThree(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(reverseThree(new int[]{5, 11, 9})));
        System.out.println(Arrays.toString(reverseThree(new int[]{7, 0, 0})));

    }
}
