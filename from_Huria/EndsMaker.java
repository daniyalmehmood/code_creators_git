import java.util.Arrays;

public class EndsMaker {
    public static int[] firstLastPicker(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(firstLastPicker(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(firstLastPicker(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(firstLastPicker(new int[]{7, 4, 6, 2})));
    }
}