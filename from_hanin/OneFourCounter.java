//Array-2 > more14
public class OneFourCounter {
    public static boolean more14(int[] nums) {
        int conutFour = 0;
        int conutOne = 0;
        for (int i=0 ; i<nums.length ; i++){
            if (nums[i]== 1 ){  conutOne ++ ;}
            if (nums[i]== 4 ){  conutFour ++ ;}
        }
        if (conutFour < conutOne ){ return true; }
        return false ;
    }
}
