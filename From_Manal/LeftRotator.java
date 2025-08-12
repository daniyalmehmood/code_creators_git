import java.util.Arrays;

// A class that rotates a 3-element array to the left
public class LeftRotator {

    public static int[] rotateLeftThreeElementArray(int[] nums) {
        return new int[] {
            nums[1],  // second element moves to first
            nums[2],  // third element moves to second
            nums[0]   // first element moves to last
        };
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateLeftThreeElementArray(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(rotateLeftThreeElementArray(new int[]{5, 11, 9})));
        System.out.println(Arrays.toString(rotateLeftThreeElementArray(new int[]{7, 0, 0})));
    }
}
