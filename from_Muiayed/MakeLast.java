public class MakeLast {
        public int[] makeLast(int[] nums) {
            int[] result = new int[nums.length * 2];
            result[result.length - 1] = nums[nums.length - 1];
            return result;
        }

        public static void main(String[] args) {
            MakeLast ml = new MakeLast();
            int[] out = ml.makeLast(new int[]{4, 5, 6});
            for (int n : out) System.out.print(n + " ");  // 0 0 0 0 0 6
        }
    }
