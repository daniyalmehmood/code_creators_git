public class ThreeCounter {
    public boolean threeCountPassOne(int[]nums) {
        int threeCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                threeCount++;
                if (i + 1 < nums.length && nums[i + 1] == 3) {
                    return false;
                }
            }
        }
        return threeCount == 3;
    }
}