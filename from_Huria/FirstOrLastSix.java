public class FirstOrLastSix {
    public static boolean firstOrLastSix(int[] nums) {
        if (nums.length >= 1) {
            if (nums[0] == 6 || nums[nums.length - 1] == 6) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(firstOrLastSix(new int[]{1, 2, 6}));
        System.out.println(firstOrLastSix(new int[]{6, 1, 2, 3}));
        System.out.println(firstOrLastSix(new int[]{13, 6, 1, 2, 3}));
        System.out.println(firstOrLastSix(new int[]{13, 6, 1, 2, 6}));
        System.out.println(firstOrLastSix(new int[]{6}));
        System.out.println(firstOrLastSix(new int[]{5, 6}));
    }
}
