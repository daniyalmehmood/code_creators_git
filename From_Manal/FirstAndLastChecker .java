// A class to check if the first and last elements of an array are the same
public class FirstAndLastChecker {

    public static boolean isSameFirstAndLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(isSameFirstAndLast(new int[]{1, 2, 3}));     // false
        System.out.println(isSameFirstAndLast(new int[]{1, 2, 3, 1}));  // true
        System.out.println(isSameFirstAndLast(new int[]{1, 2, 1}));     // true
    }
}
