import java.util.Arrays;
public class MaxEndThree {
    public static int[] maxEnd3(int[] nums) {
        if (nums[0] > nums[2]) {
            return new int[]{nums[0], nums[0], nums[0]};
        } else  {
            return new int[]{nums[2], nums[2], nums[2]};
        }

    }
    public static void main(String[]args) {
        System.out.println(Arrays.toString(maxEnd3(new int[]{1,2,3})));
        System.out.println(Arrays.toString(maxEnd3(new int[]{11, 5, 9})));
        System.out.println(Arrays.toString(maxEnd3(new int[]{2, 11, 3})));
    }

}
