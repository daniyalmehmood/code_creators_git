public class ArrayElementChecker {
    public boolean checkFirstEmenetAndLastElementEquality(int[] nums) {
        return nums.length>=1 && nums[0]==nums[nums.length-1];
    }

}
