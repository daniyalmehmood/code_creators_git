public class BigDiff {

    public int differenceBetweenMaxAndMin(int[] nums) {

        int maxValue=nums[0];
        int minValue=nums[0];
        for (int i=0; i<nums.length; i++){
            maxValue= Math.max(nums[i],maxValue);
            minValue= Math.min(nums[i],minValue);



        }
        return maxValue-minValue;

    }
}
