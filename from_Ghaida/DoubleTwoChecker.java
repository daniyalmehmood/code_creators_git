public class DoubleTwoChecker {//Array-2 > has22
    public static void main(String[] args) {
        System.out.println(hasDoubleTwo(new int[]{1, 2, 2}));// → true
        System.out.println(hasDoubleTwo(new int[]{1, 2, 1, 2}));// → false
        System.out.println(hasDoubleTwo(new int[]{2, 1, 2}));// → false
    }
    public static boolean hasDoubleTwo(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }
}