public class ArrayValidator  {

    public boolean hasNoTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int number = nums[i];

            if (nums[i + 1] == number && nums[i + 2] == number) return false;
        }
        return true;
    }
}
