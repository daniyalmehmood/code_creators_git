public class SumSixToSeven {
    public int sumIgnoringSixToSeven(int[] nums) {
        int sum = 0;
        boolean ignore  = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                ignore  = true;
            } else if (ignore  && nums[i] == 7) {
                ignore  = false;
            } else if (!ignore ) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
