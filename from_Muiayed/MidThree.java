public class MidThree {
        public int[] midThree(int[] nums) {
            int mid = nums.length / 2;
            return new int[]{nums[mid - 1], nums[mid], nums[mid + 1]};
        }

        public static void main(String[] args) {
            MidThree mt = new MidThree();
            int[] out = mt.midThree(new int[]{1, 2, 3, 4, 5});
            System.out.println(out[0] + " " + out[1] + " " + out[2]);
        }
}
