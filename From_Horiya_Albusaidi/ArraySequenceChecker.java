public class ArraySequenceChecker {
    public boolean checkOneTwoThreeSequence(int[] nums) {
        if(nums.length >2)
        {
            for(int i=0;i<nums.length-1;i++)
            {
                if(nums[i]==1 && nums[i+1]==2 && nums[i+2]==3)
                    return true;
            }
        }

        return false;
    }

}
