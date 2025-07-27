package Array_1;

public class SameFirstLast {
    public boolean sameFirstLast(int[] nums) {
        return nums.length>=1 && nums[0]==nums[nums.length-1];
    }

}
