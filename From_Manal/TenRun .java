// Method changes elements after a multiple of 10 to be that multiple until the next multiple of 10

    public class TenRun {

        public static int[] tenRun(int[] nums) {
            int currentMultiple = 0; // store the last multiple of 10 found
            boolean hasMultiple = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 10 == 0) {
                    currentMultiple = nums[i];
                    hasMultiple = true;
                } else if (hasMultiple) {
                    nums[i] = currentMultiple; // replace with last multiple
                }
            }

            return nums;
        }

        public static void main(String[] args) {
            int[] arr1 = {2, 10, 3, 4, 20, 5};
            int[] arr2 = {10, 1, 20, 2};
            int[] arr3 = {10, 1, 9, 20};

            System.out.println(java.util.Arrays.toString(tenRun(arr1)));
            System.out.println(java.util.Arrays.toString(tenRun(arr2))); 
            System.out.println(java.util.Arrays.toString(tenRun(arr3))); 
        }
    }