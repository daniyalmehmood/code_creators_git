import java.util.Arrays;

    public class MultipleOfTenRunner {

        // Method replaces elements after a multiple of 10 with that multiple until the next multiple
        public static int[] replaceAfterMultipleOfTen(int[] nums) {
            int currentMultiple = 0;
            boolean hasMultiple = false;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 10 == 0) {
                    currentMultiple = nums[i];
                    hasMultiple = true;
                } else if (hasMultiple) {
                    nums[i] = currentMultiple;
                }
            }

            return nums;
        }

        public static void main(String[]  args) {
            System.out.print(Arrays.toString(replaceAfterMultipleOfTen(new int[]{2, 10, 3, 4, 20, 5})) + " ");
            System.out.print(Arrays.toString(replaceAfterMultipleOfTen(new int[]{10, 1, 20, 2})) + " ");
            System.out.print(Arrays.toString(replaceAfterMultipleOfTen(new int[]{10, 1, 9, 20})));
        }
    }