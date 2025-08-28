public class RotateLeft3 {
        public int[] rotateLeft3(int[] nums) {
            return new int[]{nums[1], nums[2], nums[0]};
        }

        public static void main(String[] args) {
            RotateLeft3 r = new RotateLeft3();
            int[] out = r.rotateLeft3(new int[]{1, 2, 3});
            System.out.println(out[0] + " " + out[1] + " " + out[2]); // 2 3 1
        }
    }
