public class NoTriples {
    public boolean noTriples(int[] nums) {
        for(int index=0;index<nums.length-2;index++)
            if(nums[index]==nums[index+1] && nums[index+1]==nums[index+2])
                return false;
        return true;
    }
	}
