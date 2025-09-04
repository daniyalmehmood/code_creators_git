public class DifferenceCalculator {//Array-2 > bigDiff
    public static void main(String[] args) {
        System.out.println(calculateBigDifference(new int[] {10, 3, 5, 6}));// → 7
        System.out.println(calculateBigDifference(new int[]{7, 2, 10, 9}));// → 8
        System.out.println(calculateBigDifference(new int[]{2, 10, 7, 2}));// → 8
    }
    public static int calculateBigDifference(int[] nums) {
        int largestNumber = nums[0];
        int smallestNumber = nums[0];
        for (int i = 0; i < nums.length; i++) {
            largestNumber = Math.max(largestNumber, nums[i]);
            smallestNumber = Math.min(smallestNumber, nums[i]);
        }
        return largestNumber - smallestNumber;
    }
}