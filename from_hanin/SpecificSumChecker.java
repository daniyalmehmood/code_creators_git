//Array-2 > sum28
public class SpecificSumChecker {
    public static boolean sumOfTwosIsEight(int[] nums) {
        int sum=0;
        for (int i=0 ; i< nums.length ; i++){
            if(nums[i]==2) {
                sum +=2; }
        }
        return sum == 8;
    }
}
