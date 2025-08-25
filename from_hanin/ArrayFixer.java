//Array-3 > fix34
public class ArrayFixer {
    public static int[] arrangeThreesFours(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 4 && (nums[j - 1] != 3 || j == 0)) {
                        int result = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = result;
                    }

                }

            }
        }
        return nums;
    }

}
