package Warmup2;

public class ArrayElementCounter {
    public int countNumberOfNine(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) count++;
        }
        return count;
    }

}
