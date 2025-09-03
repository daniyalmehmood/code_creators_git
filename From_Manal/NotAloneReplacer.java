import java.util.Arrays;

    public class NotAloneReplacer {

        // Method replaces "alone" values in the array with the larger neighbor
        public static int[] notAlone(int[] nums, int val) {
            for (int i = 1; i < nums.length - 1; i++) {
                if (nums[i] == val && nums[i-1] != val && nums[i+1] != val) {
                    nums[i] = Math.max(nums[i-1], nums[i+1]);
                }
            }
            return nums;
        }

        public static void main(String[] args) {
            System.out.println(Arrays.toString(notAlone(new int[]{1, 2, 3}, 2)));
            System.out.println(Arrays.toString(notAlone(new int[]{1, 2, 3, 2, 5, 2, 2}, 2)));
            System.out.println(Arrays.toString(notAlone(new int[]{3, 4, 3}, 3)));
        }
    }