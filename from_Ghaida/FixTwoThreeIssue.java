public class FixTwoThreeIssue {
    public static void main(String[] args) {
        System.out.println(replaceThreeAfterTwo(new int[]{1, 2, 3}));// → [1, 2, 0]
        System.out.println(replaceThreeAfterTwo(new int[]{2, 3, 5}));// → [2, 0, 5]
        System.out.println(replaceThreeAfterTwo(new int[]{1, 2, 1}));// → [1, 2, 1]
    }
    public static int[] replaceThreeAfterTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }
}
