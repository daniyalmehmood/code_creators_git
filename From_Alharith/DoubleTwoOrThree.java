public class DoubleTwoOrThree {

    public boolean hasDoubleTwoOrThree(int[] nums) {
        return (nums.length == 2) &&
                ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3));
    }

}
