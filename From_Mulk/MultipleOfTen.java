//Array-2 > tenRun
public class MultipleOfTen {
    public int[] fillAfterTenWithSameMultiple(int[] nums) {
        int current = 0;
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                current = nums[i];
                found = true;
            } else if (found) {
                nums[i] = current;
            }

        }
        return nums;
    }
}