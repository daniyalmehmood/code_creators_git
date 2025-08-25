public class TripleUp {
    public static boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i] + 2) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(tripleUp(new int[]{1, 4, 5, 6, 2}));
        System.out.println(tripleUp(new int[]{1, 2, 3}));
        System.out.println(tripleUp(new int[]{1, 2, 4}));
    }
}