import java.util.Arrays;

public class MiddleThreeElementsExtractor {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getMiddleThree(new int[] {1, 2, 3, 4, 5})));// → [2, 3, 4]
        System.out.println(Arrays.toString(getMiddleThree(new int[] {8, 6, 7, 5, 3, 0, 9})));// → [7, 5, 3]
        System.out.println(Arrays.toString(getMiddleThree(new int[] {1, 2, 3})));// → [1, 2, 3]
    }
    public static int[] getMiddleThree(int[] nums) {
        int mid = nums.length / 2;
        return new int[] {nums[mid-1], nums[mid], nums[mid+1]};
    }
}
