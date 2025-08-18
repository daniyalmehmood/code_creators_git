public class SumTwoEight {

    public boolean isSumOfTwosEight(int[] nums) {
        int sum=0;
        for (int i=0; i<nums.length; i++){

            if (nums[i]==2) sum+=2;
        }
        return sum==8;
    }

}
