public class Has9InFirstFour {
    public boolean has9InFirstFour(int[]nums) {
        int lenghtOFArray = Math.min(nums.length, 4);
        for (int i = 0; i < lenghtOFArray; i++) {
            if (nums[i] == 9)
                return true;
        }
        return false;
    }
}