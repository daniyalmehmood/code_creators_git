public class MakeMiddle {

    public int[] makeMiddle(int[] nums) {
        int len = (nums.length/2)-1;
        if (nums.length<=2) return nums;
        return new int[] {nums[len],nums[len+1]};
    }

}
