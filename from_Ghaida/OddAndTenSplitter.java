public class OddAndTenSplitter {//Recursion-2 > splitOdd10
    public static void main(String[] args) {
        System.out.println(canSplitWithOddAndTen(new int[]{5, 5, 5}));// → true
        System.out.println(canSplitWithOddAndTen(new int[]{5, 5, 6}));// → false
        System.out.println(canSplitWithOddAndTen(new int[]{5, 5, 6, 1}));// → true
    }
    public static boolean canSplitWithOddAndTen(int[] nums) {
        return splitOdd10Helper(nums, 0, 0, 0);
    }
    private static boolean splitOdd10Helper(int[] nums, int currentIndex, int sumOfFirstGroup, int sumOfSecondGroup) {
        if (currentIndex == nums.length) {
            // one of the two groups must be odd and the other must be divisible by 10 && the other must be odd
            return (sumOfFirstGroup % 10 == 0 && sumOfSecondGroup % 2 == 1) || (sumOfSecondGroup % 10 == 0 && sumOfFirstGroup % 2 == 1);
        }
        else if (splitOdd10Helper(nums, currentIndex + 1, sumOfFirstGroup + nums[currentIndex], sumOfSecondGroup)) {
            return true;// group 1
        }
        else if (splitOdd10Helper(nums, currentIndex + 1, sumOfFirstGroup, sumOfSecondGroup + nums[currentIndex])) {
            return true; //group 2
        }
        return false;
    }
}