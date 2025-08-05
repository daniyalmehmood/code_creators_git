public class UnluckyOne {
public boolean unlucky1(int[] nums) {
        if(nums.length>1&&nums[0]==1&&nums[1]==3)
            return true;
        else if(nums.length>1&&nums[nums.length-2]==1&&nums[nums.length-1]==3)
            return true;
        return false;
    }
}
