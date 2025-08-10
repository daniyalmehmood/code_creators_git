import java.util.Arrays;
public class ReplaceThreeAfterTwo {
    public static int[] replaceThreeFollowingTwoByZero(int[] nums) {
            if (nums[0] == 2 && nums[1] == 3) { // check if the first element is 2 followed by 3 "The array length is 3"
                 nums[1] = 0; // change 3 to 0  
            }
            if (nums[1] == 2 && nums[2] == 3) { // check if the second element is 2 followed by 3 
                nums[2] = 0; // change 3 to 0   
            }
        return nums; // return the array after changes 
    }
    public static void main (String[] args){
        System.out.println(Arrays.toString(replaceThreeFollowingTwoByZero(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(replaceThreeFollowingTwoByZero(new int[]{2, 3, 5})));
    }
}
