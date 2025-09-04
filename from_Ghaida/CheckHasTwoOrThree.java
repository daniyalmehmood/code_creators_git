public class CheckHasTwoOrThree {
    public static void main(String[] args) {
        System.out.println(hasTwoOrThree(new int[]{2, 5}));// → true
        System.out.println(hasTwoOrThree(new int[]{4, 3}));// → true
        System.out.println(hasTwoOrThree(new int[]{4, 5}));// → false
    }
    public static boolean hasTwoOrThree(int[] nums) {
        return nums[0] == 2 || nums[1] == 3 || nums[0] == 3 || nums[1] == 2;
    }
}