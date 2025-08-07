public class MiddleThreeExtractor  {

    public int[] extractMiddleThree(int[] nums) {
        if (nums.length<4) return nums;

        int len= (nums.length/2);

        return new int[] {nums[len-1],nums[len],nums[len+1]};
    }

}
