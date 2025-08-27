public class MakeMiddle {
    public int[]makeArrayFromMiddle(int[]nums) {
        if (nums.length > 2) {
            int index = nums.length / 2;
            return new int[]{
                nums[index - 1],
                nums[index]
            };

        }
        return nums;

    }
}