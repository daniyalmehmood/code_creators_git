public class MaxTriple {
        public int maxTriple(int[] nums) {
            return Math.max(nums[0],
                    Math.max(nums[nums.length / 2], nums[nums.length - 1]));
        }

        public static void main(String[] args) {
            MaxTriple mt = new MaxTriple();
            System.out.println(mt.maxTriple(new int[]{1, 2, 3}));
            System.out.println(mt.maxTriple(new int[]{1, 5, 3}));
            System.out.println(mt.maxTriple(new int[]{5, 2, 3}));
        }
    }

