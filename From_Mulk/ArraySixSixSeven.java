public class ArraySixSixSeven {
    public int countSixFollowedBySixOrSeven(int[] nums) {
        int sequenceCount = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                sequenceCount++;
            }
        }
        return sequenceCount;
    }
}