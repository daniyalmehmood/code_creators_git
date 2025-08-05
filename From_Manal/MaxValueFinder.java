public class MaxValueFinder {
    // This method returns the largest value among the first, middle, and last elements
    public static int findMaxOfFirstMiddleLast(int[] nums) {
        int first = nums[0];
        int last = nums[nums.length - 1];
        int middle = nums[nums.length / 2];
        // Return the maximum of the three
        return Math.max(first, Math.max(middle, last));

    }
    public static void main(String[] args) {
        System.out.println(findMaxOfFirstMiddleLast(new int[]{1, 2, 3}));
        System.out.println(findMaxOfFirstMiddleLast(new int[]{1, 5, 3}));
        System.out.println(findMaxOfFirstMiddleLast(new int[]{5, 2, 3}));
    }
}

