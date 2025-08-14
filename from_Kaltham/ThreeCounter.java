public class ThreeCounter {
    public boolean threeCountPassOne(int[]nums) {
        int threeCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                threeCount++;
                i++;
            }
        }
        return threeCount == 3;
    }
}