import java.util.Arrays;

public class FrontPiece {
    public static int[] firstTwoValues(int[] nums) {
        int[] firstTwo = new int[2];
        if (nums.length >= 2){
            firstTwo[0] = nums[0];
            firstTwo[1] = nums[1];
        }
        else{
            firstTwo = nums;
        }
        return firstTwo;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(firstTwoValues(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(firstTwoValues(new int[]{1, 2})));
        System.out.println(Arrays.toString(firstTwoValues(new int[]{1})));
    }
}
