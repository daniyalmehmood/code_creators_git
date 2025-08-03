public class FirstLastSix {
    public boolean firstLastSix(int[]nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;

        }
        return false;
    }

}