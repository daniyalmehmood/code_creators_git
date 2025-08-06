public class TwoAndThreeChecker {
    public static boolean hasTwoOrThree(int[] nums) {
        return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] ==3;
    }
    public static void main(String[] args) {
        System.out.println(hasTwoOrThree(new int[]{2, 5}));
        System.out.println(hasTwoOrThree(new int[]{4, 3}));
        System.out.println(hasTwoOrThree(new int[]{4, 5}));
    }
}