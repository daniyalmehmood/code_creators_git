public class CheckTwoThree {
    public static boolean hasTwoOrThreeTwice(int[] nums) {
        if (nums.length > 0 && nums.length <= 2) {
            return (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasTwoOrThreeTwice(new int[]{2, 2}));
        System.out.println(hasTwoOrThreeTwice(new int[]{3, 3}));
        System.out.println(hasTwoOrThreeTwice(new int[]{2, 3}));
    }
}
