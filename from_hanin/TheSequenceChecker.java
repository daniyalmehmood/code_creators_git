//Array-2 > has12
public class TheSequenceChecker {
    public  static boolean containsOneBeforeTwo(int[] nums) {
        boolean foundOne = false;
        for (int i=0;i<nums.length;i++){
            if(nums[i] == 1) {foundOne = true;}
            if(nums[i] == 2 && foundOne == true){
                return true; }
        }
        return false ;
    }

}
