public class FirstLastSix {
    public boolean checkSixAtEdges(int[] nums) {
        if (nums.length >= 1 && nums[0] == 6) {
            return true;
        }
        if (nums.length >= 1 && nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
    }
}
