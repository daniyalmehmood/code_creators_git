public class FirstLastElementsChecker {
    public static void main(String[] args) {
        System.out.println(isFirstLastEqualSix(new int[]{1, 2, 6}));// → true
        System.out.println(isFirstLastEqualSix(new int[]{6, 1, 2, 3}));// → true
        System.out.println(isFirstLastEqualSix(new int[]{13, 6, 1, 2, 3}));// → false
    }
    public static boolean isFirstLastEqualSix(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }
}
