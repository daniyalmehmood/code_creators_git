public class SumIgnoringSixtoSeven {
    public int calculateSumIgnoringSixtoSeven(int[]nums) {
        int sum = 0;
        boolean isIn6And7 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                isIn6And7 = true;
            } else if (nums[i] == 7 && isIn6And7) {
                isIn6And7 = false;

            } else if (!isIn6And7) {
                sum += nums[i];
            }
        }
        return sum;
    }
}