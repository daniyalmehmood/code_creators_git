public class SequenceGroupAnalyzer {//Array-3 > countClumps
    public static void main(String[] args) {
        System.out.println(calculateClumpCount(new int[]{1, 2, 2, 3, 4, 4})); // → 2
        System.out.println(calculateClumpCount(new int[]{1, 1, 2, 1, 1})); // → 2
        System.out.println(calculateClumpCount(new int[]{1, 1, 1, 1, 1})); // → 1
    }
    public static int calculateClumpCount(int[] nums) {
        int count = 0;
        boolean isInClump = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && !isInClump) {
                count++;
                isInClump = true;
            }
            else if (nums[i] != nums[i + 1]) {
                isInClump = false;
            }
        }
        return count;
    }
}