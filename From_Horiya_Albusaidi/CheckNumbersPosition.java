public class CheckNumbersPosition {
    public boolean checkNumberSixPosition(int[] nums) {
        if(nums.length >=1 && (nums[0]==6 || nums[nums.length-1] == 6)) return true;
        else return false;
    }

}
