import java.util.Arrays;

public class MiddleThreeFinder {
    public static int[] getMiddleThreeElements(int[] nums) {
        int mid = nums.length / 2;
        return new int[]{nums[mid- 1], nums[mid], nums[mid + 1]};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getMiddleThreeElements(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(getMiddleThreeElements(new int[]{8, 6, 7, 5, 3, 0, 9})));
        System.out.println(Arrays.toString(getMiddleThreeElements(new int[]{1, 2, 3})));
    }
}
