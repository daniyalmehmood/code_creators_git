public class SumTwo {

    public int sumFirstTwo(int[] nums) {
        if (nums.length<1) return 0;
        if (nums.length==1) return nums[0];
        return nums[0] + nums[1];
    }

}
