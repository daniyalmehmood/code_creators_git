import java.util.Arrays;

public class LeftShiftThree {
    public static int[] rotateLeftThree(int[] nums) {
        int rotateleft[] = {nums[1], nums[2], nums[0]};
        return rotateleft;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateLeftThree(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(rotateLeftThree(new int[]{5, 11, 9})));
        System.out.println(Arrays.toString(rotateLeftThree(new int[]{1, 2, 1})));
    }
}
