public class ArraySixSixSeven {
    public int count6FollowedBy6Or7(int[] nums) {
        int countX = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                countX++;
            }
        }
        return countX;
    }
}