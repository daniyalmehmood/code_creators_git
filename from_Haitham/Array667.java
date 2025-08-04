public class Array667 {
 public int array667(int[] nums) {
        int count = 0;
        for (int index = 0; index < nums.length - 1; index++) {
            if (nums[index] == 6 && (nums[index + 1] == 6 || nums[index + 1] == 7))
                count++;
        }
        return count;
    }
	}
