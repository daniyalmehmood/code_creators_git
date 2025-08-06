import java.util.Arrays;
// A class that reverses a 3-element integer array
public class ArrayReverser {

    public static int[] reverseThreeElementArray(int[] nums) {
        return new int[] {
                nums[2],  // last element becomes first
                nums[1],  // middle element remains in place
                nums[0]   // first element becomes last
        };
    }

    public static void main(String[] args) {
        // Test cases to demonstrate the reversal
        System.out.println(Arrays.toString(reverseThreeElementArray(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(reverseThreeElementArray(new int[]{5, 11, 9})));
        System.out.println(Arrays.toString(reverseThreeElementArray(new int[]{7, 0, 0})));
    }
}
