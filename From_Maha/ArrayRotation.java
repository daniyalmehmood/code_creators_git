public class ArrayRotation {
    public static int[] rotateLeft3(int[] nums) {
        // Return a new array with elements shifted left
        return new int[] { nums[1], nums[2], nums[0] };
    }
}
