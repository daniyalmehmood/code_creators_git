// Array-2 > has12
public class OneTwoPatternFinder {
    public static boolean detectOneThenTwo(int[] nums) {
        boolean foundOne = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                foundOne = true;
            }
            if (foundOne && nums[i] == 2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(detectOneThenTwo(new int[]{1, 3, 2}));
        System.out.println(detectOneThenTwo(new int[]{3, 1, 2}));
        System.out.println(detectOneThenTwo(new int[]{3, 1, 4, 5, 2}));
    }
}
