package Warmup2;

public class ArrayFront9 {
    public boolean arrayFront9(int[] nums) {

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==9) return true;
            if(i==3)
            {
                break;
            }
        }
        return false;
    }

}
