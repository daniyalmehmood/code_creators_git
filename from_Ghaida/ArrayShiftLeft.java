import java.util.Arrays;

public class ArrayShiftLeft {//Array-2 > shiftLeft
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveFirstToEnd(new int[]{6, 2, 5, 3})));// → [2, 5, 3, 6]
        System.out.println(Arrays.toString(moveFirstToEnd(new int[]{1, 2})));// → [2, 1]
        System.out.println(Arrays.toString(moveFirstToEnd(new int[]{1})));// → [1]
    }
    public static int[] moveFirstToEnd(int[] nums) {
        if(nums.length <= 1) return nums;

        int firstIndex = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i -1] = nums[i];
        }
        nums[nums.length -1] = firstIndex;
        return nums;
    }
}