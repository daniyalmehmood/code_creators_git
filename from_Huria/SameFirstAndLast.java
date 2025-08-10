public class SameFirstAndLast {
    public static boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1) {
            if (nums[0] == nums[nums.length - 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(sameFirstLast(new int[]{1, 2, 3}));
        System.out.println(sameFirstLast(new int[]{1, 2, 3, 1}));
        System.out.println(sameFirstLast(new int[]{1, 2, 1}));
        System.out.println(sameFirstLast(new int[]{7}));
        System.out.println(sameFirstLast(new int[]{}));

    }
}
