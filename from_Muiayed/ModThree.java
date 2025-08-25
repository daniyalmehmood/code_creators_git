public class ModThree {
    public static boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int a = nums[i] % 2;
            int b = nums[i + 1] % 2;
            int c = nums[i + 2] % 2;
            if (a == b && b == c) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(modThree(new int[]{2, 1, 3, 5}));
        System.out.println(modThree(new int[]{2, 1, 2, 5}));
        System.out.println(modThree(new int[]{2, 4, 2, 5}));
    }
}