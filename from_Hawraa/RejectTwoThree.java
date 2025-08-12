public class RejectTwoThree {
    public static boolean noTwoOrThree(int[] nums) {
        return !(nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3);
    }

    public static void main(String[] args) {
        System.out.println(noTwoOrThree(new int[]{4, 5}));
        System.out.println(noTwoOrThree(new int[]{4, 2}));
        System.out.println(noTwoOrThree(new int[]{3, 5}));
    }
}
