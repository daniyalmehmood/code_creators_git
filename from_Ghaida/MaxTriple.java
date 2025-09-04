public class MaxTriple { //Array-1. maxTriple
    public static void main(String[] args) {
        System.out.println(maxOfThree(new int[]{1, 2, 3}));// → 3
        System.out.println(maxOfThree(new int[]{1, 5, 3}));// → 5
        System.out.println(maxOfThree(new int[]{5, 2, 3}));// → 5
    }
    public static int maxOfThree(int[] nums) {
        int middleElement = nums.length / 2;
        return Math.max(nums[0], Math.max(nums[middleElement], nums[nums.length - 1]));
    }
}