public class MidThree {

    public int[] midThree(int[] nums) {
        if (nums.length<4) return nums;

        int len= (nums.length/2);

        return new int[] {nums[len-1],nums[len],nums[len+1]};
    }

}
