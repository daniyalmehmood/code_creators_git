import java.util.Arrays;

public class EvenOddArranger {
    public static int[] replacingEvensBeforeOdds(int[] nums) {
        int[] result = new int[nums.length];
        int evenValue= 0;
        int oddValue= nums.length-1;
        for (int i=0 ; i<nums.length ; i++){
            if (nums[i]%2 == 0){
                result[evenValue]= nums[i];
                evenValue++;
            }
            else {
                result[oddValue]= nums[i];
                oddValue--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] result = replacingEvensBeforeOdds(new int[]{3, 3, 2});
        System.out.println(Arrays.toString(result));
    }

}
