import java.util.Arrays;

public class FrontCutter {
    public static int[] frontPiece(int[] nums) {
        if (nums.length >= 2) {
            int front[] = {nums[0], nums[1]};
            return front;
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(frontPiece(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(frontPiece(new int[]{1, 2})));
        System.out.println(Arrays.toString(frontPiece(new int[]{1})));
        System.out.println(Arrays.toString(frontPiece(new int[]{})));
        System.out.println(Arrays.toString(frontPiece(new int[]{6, 5, 0})));
    }
}