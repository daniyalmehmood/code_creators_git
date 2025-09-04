import java.util.Arrays;
public class TenRunModifier {
    public static int[] replaceFollowingValuesWithLastMultipleOfTen(int[] nums) {
        Integer multipleOf10 = -1; //  initialize a variable to track multiple of 10
        for (int i = 0; i < nums.length; i++) { // use for loop to go through the array
            if (nums[i] % 10 == 0) { // check if the element is a 10,20,30,...
                multipleOf10 = nums[i]; //update the value of the tracking variable
            } if (multipleOf10 != -1) { // while the tracking variable is not empty
                nums[i] = multipleOf10; // replace the element with last seen multiple of 10
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] result = replaceFollowingValuesWithLastMultipleOfTen(new int[]{2, 10, 3, 4, 20, 5});
        System.out.println(Arrays.toString(result));
    }
}
