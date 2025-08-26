public class SplitByThreeAndFive {//Recursion-2 > split53
    public static void main(String[] args) {
        System.out.println(canSplitByThreeAndFive(new int[]{1, 1}));// → true
        System.out.println(canSplitByThreeAndFive(new int[]{1, 1, 1}));// → false
        System.out.println(canSplitByThreeAndFive(new int[]{2, 4, 2}));// → true
    }
    public static boolean canSplitByThreeAndFive(int[] nums) {
        return splitHelper(nums, 0, 0, 0);
    }
    private static boolean splitHelper(int[] nums, int currentIndex, int sumOfFirstGroup, int sumOfSecondGroup) {
        if (currentIndex == nums.length) {
            return sumOfFirstGroup == sumOfSecondGroup;
        }
        else if (nums[currentIndex] % 5 == 0) {
            return splitHelper(nums, currentIndex + 1, sumOfFirstGroup + nums[currentIndex], sumOfSecondGroup);// group 1
        }
        else if (nums[currentIndex] % 3 == 0) {
            return splitHelper(nums, currentIndex + 1, sumOfFirstGroup, sumOfSecondGroup + nums[currentIndex]); //group 2
        }
        return splitHelper(nums, currentIndex + 1, sumOfFirstGroup + nums[currentIndex], sumOfSecondGroup) || splitHelper(nums, currentIndex + 1, sumOfFirstGroup, sumOfSecondGroup + nums[currentIndex]);
    }
}
