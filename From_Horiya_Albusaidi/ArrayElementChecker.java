public class ArrayElementsChecker {
    public boolean hasNineInFirstFour(int[] nums) {

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
