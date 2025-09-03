import java.util.Arrays;

public class GroupEvensFirstAndOddsLast {
    public static int[] replacingEvensBeforeOdds(int[] nums) {
        int theResult[]= new int[nums.length];
        int evenIndex=0;
        int oddIndex=nums.length-1;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]%2==0){
                theResult[evenIndex]=nums[i];
                evenIndex++;
            }
            if(nums[i]%2!=0){
                theResult[oddIndex]=nums[i];
                oddIndex--;
            }
        }
        return theResult;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(replacingEvensBeforeOdds(new int[]{1, 0, 1, 0, 0, 1, 1})));
        System.out.println(Arrays.toString(replacingEvensBeforeOdds(new int[]{3, 3, 2})));
        System.out.println(Arrays.toString(replacingEvensBeforeOdds(new int[]{2, 2, 2})));
    }
}
