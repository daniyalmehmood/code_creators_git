public class Fix23 {
        public int[] fix23(int[] nums) {
            int[] res = { nums[0], nums[1], nums[2] };
            for (int i = 0; i < 2; i++) {
                if (res[i] == 2 && res[i + 1] == 3) {
                    res[i + 1] = 0;
                }
            }
            return res;
        }

        public static void main(String[] args) {
            Fix23 f = new Fix23();
            int[] out = f.fix23(new int[]{1, 2, 3});
            System.out.println(out[0] + " " + out[1] + " " + out[2]); // 1 2 0
        }
    }
