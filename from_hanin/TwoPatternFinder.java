//Array-2 : has22
public class TwoPatternFinder {
    public boolean hasDouble2(int[] nums) {
        for (int i=0; i<nums.length- 1;i++ ){
            if (nums[i]==2 && nums[i+1]==2 )
            {return true ; }
        }
        return false ; }

}
