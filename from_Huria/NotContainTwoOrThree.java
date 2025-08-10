public class NotContainTwoOrThree {
    public static boolean NoTwoOrThree(int[] nums) {
        if (nums[0] == 2 || nums[1] == 3 || nums[1] == 2 || nums[0] == 3) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(NoTwoOrThree(new int[]{4, 5}));
        System.out.println(NoTwoOrThree(new int[]{4, 2}));
        System.out.println(NoTwoOrThree(new int[]{3, 5}));
    }
}

