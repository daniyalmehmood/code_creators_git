public class MakeMiddle {

    public int[] extractMiddlePair(int[] nums) {
        int len = (nums.length/2)-1;
        if (nums.length<=2) return nums;
        return new int[] {nums[len],nums[len+1]};
    }

}
