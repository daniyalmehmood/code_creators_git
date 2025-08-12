public class MaxTriple {
    public static int maxTriple(int[] nums) {
        int firstValues = nums[0];
        int middleValues = nums[nums.length / 2];
        int lastValues = nums[nums.length - 1];
        int max;
        if (firstValues > middleValues && firstValues > lastValues) {
            max = firstValues;
        } else if (firstValues < middleValues && middleValues > lastValues) {
            max = middleValues;
        } else {
            max = lastValues;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxTriple(new int[]{1, 2, 3}));
        System.out.println(maxTriple(new int[]{1, 5, 3}));
        System.out.println(maxTriple(new int[]{5, 2, 3}));
    }
}
