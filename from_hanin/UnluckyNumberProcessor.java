//Array-2 > sum13
public class UnluckyNumberProcessor {
    public int sumSkippingUnlucky(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++; // to skip the number 13
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }

}
