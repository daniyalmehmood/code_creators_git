// A class that calculates the sum of three integers from an array
public class ThreeElementSum {

    public static int sumFirstThreeElements(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public static void main(String[] args) {
        System.out.println(sumFirstThreeElements(new int[]{1, 2, 3}));    // Output: 6
        System.out.println(sumFirstThreeElements(new int[]{5, 11, 2}));   // Output: 18
        System.out.println(sumFirstThreeElements(new int[]{7, 0, 0}));    // Output: 7
    }
}
