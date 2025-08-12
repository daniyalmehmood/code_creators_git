import java.util.Arrays;

public class ArrayShortener {

    // This method returns a new array with the first 2 elements (or less if the array is shorter)
    public static int[] getFirstTwoElements(int[] nums) {
        // If the array has 2 or more elements
        if (nums.length >= 2) {
            return new int[] { nums[0], nums[1] };
        } 
        // If the array has only 1 element
        else if (nums.length == 1) {
            return new int[] { nums[0] };
        } 
        // If the array is empty
        else {
            return new int[] {}; // return an empty array
        }
    }

    public static void main(String[] args) {
        // Testing the method
        System.out.println(Arrays.toString(getFirstTwoElements(new int[] {1, 2, 3}))); // [1, 2]
        System.out.println(Arrays.toString(getFirstTwoElements(new int[] {1, 2})));    // [1, 2]
        System.out.println(Arrays.toString(getFirstTwoElements(new int[] {1})));       // [1]
        System.out.println(Arrays.toString(getFirstTwoElements(new int[] {})));        // []
    }
}