public class SplitArrayEqualSum {//Recursion-2 > splitArray
    public static void main(String[] args) {
        System.out.println(canBeSplitEqually(new int[]{2, 2}));// → true
        System.out.println(canBeSplitEqually(new int[]{2, 3}));// → false
        System.out.println(canBeSplitEqually(new int[]{5, 2, 3}));// → false
    }
    public static boolean canBeSplitEqually(int[] nums) {
        return canSplitFromIndex(nums, 0, 0, 0);
    }
    private static boolean canSplitFromIndex(int[] numbers, int currentIndex, int sumOfFirstGroup, int sumOfSecondGroup) {
        if (currentIndex == numbers.length) {
            return sumOfFirstGroup == sumOfSecondGroup;
        }
        return canSplitFromIndex(numbers, currentIndex + 1, sumOfFirstGroup + numbers[currentIndex], sumOfSecondGroup) ||
               canSplitFromIndex(numbers, currentIndex + 1, sumOfFirstGroup, sumOfSecondGroup + numbers[currentIndex]);
    }
}