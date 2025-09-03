public class UnluckyNumberSumCalculator {
    public static int computeSumSkippingUnluckyThirteenAndNextValue(int[] nums) {
        int sum =0 ;
        for (int i=0 ; i< nums.length ; i++){
            if(nums[i]!=13) {
                sum += nums[i];

            }
            else
            {
                i++;
            }
        }
        return sum ;
    }
    public static void main(String[] args) {
        System.out.println(computeSumSkippingUnluckyThirteenAndNextValue(new int[]{1, 2, 2, 1}));
        System.out.println(computeSumSkippingUnluckyThirteenAndNextValue(new int[]{1, 1}));
        System.out.println(computeSumSkippingUnluckyThirteenAndNextValue(new int[]{1, 2, 2, 1, 13}));
    }
}
