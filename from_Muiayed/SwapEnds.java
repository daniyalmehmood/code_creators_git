public class SwapEnds {
        public int[] swapEnds(int[] nums) {
            if (nums.length > 1) {
                int temp = nums[0];
                nums[0] = nums[nums.length - 1];
                nums[nums.length - 1] = temp;
            }
            return nums;
        }

        public static void main(String[] args) {
            SwapEnds se = new SwapEnds();
            int[] out = se.swapEnds(new int[]{1, 2, 3, 4});
            System.out.println(out[0] + " " + out[1] + " " + out[2] + " " + out[3]);
        }
    }
