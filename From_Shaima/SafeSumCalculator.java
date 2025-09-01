public class SafeSumCalculator {
    public static int calculateSumSkippingRange(int[] nums) {
        int sum=0;
        for (int i=0 ; i<nums.length ; i++){ // go through the array
            if (nums[i]==6){ // check if the value is 6
                while (i < nums.length && nums[i] != 7) { // to skip the next values after 6
                    i++;
                }
            }
            else
            {
                sum += nums[i]; // sum all the values that are not between 6 and 7 sections
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(calculateSumSkippingRange(new int[]{10, 3, 5, 6}));
    }
}
