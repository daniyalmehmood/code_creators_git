import java.util.Arrays;
public class MidThreeExtractor {
    public static int[] extractMidThreeElements(int[] nums) {
        return new int[] {nums[nums.length/2 -1],nums[nums.length/2 ],nums[nums.length/2 +1]}; //create and return a new array with length 3 has the middle three elements from 'nums' , "Note 'nums' length is odd 3,5,..."
    }
    public static void  main (String[] args){
        System.out.println(Arrays.toString(extractMidThreeElements(new int[]{8, 6, 7, 5, 3, 0, 9})));
    }
}
