public class ArrayBalancer {
    public boolean canSplitEqually(int[] nums) {
        int totalSum = 0;
        for (int i=0; i<nums.length ; i++) {totalSum += nums[i];}
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            int rightSum = totalSum - leftSum;
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false ;
    }

}
