public class ArrayUnluckySum {
    public static int calculateSafeSum(int[] nums) {
        int sum =0;
        for (int i=0 ; i<nums.length; i++){
            if (nums[i]==13){ // skip if the element is 13
                i++;
            }
            else{
                sum+=nums[i];
            }
        }
        return sum; // the total sum without 13
    }
    public static void main(String[] args) {
        System.out.println(calculateSafeSum(new int[]{1, 2, 2, 1,13}));
    }
}
