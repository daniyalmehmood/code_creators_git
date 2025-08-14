import java.util.Arrays;

public class FrontPiece {
    public static  int[] gettFirstTwoElements(int[] nums) {
        if (nums.length >= 2) {
            return new int[]{nums[0], nums[1]};
        } else {
            return nums;
        }
    }
        public static void main(String[] args){
            System.out.println(Arrays.toString(gettFirstTwoElements(new int[] {1,2,3})));
            System.out.println(Arrays.toString(gettFirstTwoElements(new int[] {1,2})));
            System.out.println(Arrays.toString(gettFirstTwoElements(new int[] {1})));
    }
}
