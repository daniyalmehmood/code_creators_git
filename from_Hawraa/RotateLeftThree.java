import java.util.Arrays;
public class RotateLeftThree {
    public static int[] rotateLeftThree(int[] nums) {
        int[] rotated = new int[3];
        for (int i = 0; i < nums.length; i++){
            rotated[i]= nums[(i + 1) % nums.length]; // When i=0, (0 + 1) % 3 = 1, so rotated[0] = nums[1]
        }
        rotated[nums.length - 1] = nums[0];
        return rotated;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateLeftThree(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(rotateLeftThree(new int[]{5, 11, 9})));
        System.out.println(Arrays.toString(rotateLeftThree(new int[]{7, 0, 0})));
    }
}
