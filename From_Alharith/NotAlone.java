public class NotAlone {

    public int[] replaceNotAloneWithMaxNeighbor(int[] nums, int val) {

        int[] result=new int[nums.length];
        int maxValue;
        for (int i=1; i<nums.length-1; i++){
            maxValue  =Math.max(nums[i-1],nums[i+1]);

            if (  nums[i]==val && (nums[i]!=nums[i-1] && nums[i]!=nums[i+1]) ) {

                nums[i]=maxValue;
            }
        }
        return nums;
    }

}
