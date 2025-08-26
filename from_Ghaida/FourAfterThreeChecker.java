import java.util.Arrays;

public class FourAfterThreeChecker {//Array-3 > fix34
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ThreeFourReorder(new int[]{1, 3, 1, 4})));// → [1, 3, 4, 1]
        System.out.println(Arrays.toString(ThreeFourReorder(new int[]{1, 3, 1, 4, 4, 3, 1})));// → [1, 3, 4, 1, 1, 3, 4]
        System.out.println(Arrays.toString(ThreeFourReorder(new int[]{3, 2, 2, 4})));// → [3, 4, 2, 2]
    }
    public static int[] ThreeFourReorder(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 3){
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 4 && (j == 0 || nums[j - 1] != 3)) {
                        int valueAfterThree = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = valueAfterThree;
                    }
                }
            }
        }
        return nums;
    }
}