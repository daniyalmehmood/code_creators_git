public class replaceZero {
    public int[]ReplaceZeroWithMaxOdd(int[]nums) {
        int maxOdd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                maxOdd = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 != 0 && nums[j] > maxOdd) {
                        maxOdd = nums[j];

                    }

                }
                if (maxOdd != 0) {
                    nums[i] = maxOdd;
                }

            }
        }
        return nums;
    }
}