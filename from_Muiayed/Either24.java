public class Either24 {
    public static boolean either24(int[] nums) {
        boolean two = false, four = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) two = true;
            if (nums[i] == 4 && nums[i + 1] == 4) four = true;
        }
        return two ^ four;
    }

    public static void main(String[] args) {
        System.out.println(either24(new int[]{1, 2, 2}));
        System.out.println(either24(new int[]{4, 4, 1}));
        System.out.println(either24(new int[]{4, 4, 1, 2, 2}));
    }
}