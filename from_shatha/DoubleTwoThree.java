public class DoubleTwoThree {
    public static boolean hasDoubleTwoOrThree(int[] nums) {
        if (nums.length != 2) {
            return false;
        }
        return nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3;
    }
    public static void main(String[] args){
        System.out.println(hasDoubleTwoOrThree(new int[] {2,2}));
        System.out.println(hasDoubleTwoOrThree(new int[] {3,3}));
        System.out.println(hasDoubleTwoOrThree(new int[] {2,3}));

    }

}
