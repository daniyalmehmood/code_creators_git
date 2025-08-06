// A class that sums the first two elements of an integer array
public class FirstTwoSumCalculator {
    public static int sumFirstTwoElements(int[] nums) {
        if (nums.length == 0) {
            return 0; //  No elements to sum
        } else if (nums.length == 1) {
            return nums[0]; // Only one element return it
        } else {
            return nums[0] + nums[1]; //  Add the first two
        }
    }

    public static void main(String[] args) {
        System.out.println(sumFirstTwoElements(new int[]{1, 2, 3}));       // Output: 3
        System.out.println(sumFirstTwoElements(new int[]{1, 1}));          // Output: 2
        System.out.println(sumFirstTwoElements(new int[]{1, 1, 1, 1}));    // Output: 2
    }
}
