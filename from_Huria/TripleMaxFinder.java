public class TripleMaxFinder {
    public static int maxTriple(int[] nums) {
        int max = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];
        if (max < middle) {
            max = middle;
            if (middle < last) {
                max = last;
            }
        } else if (max < last) {
            max = last;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxTriple(new int[]{1, 2, 3}));
        System.out.println(maxTriple(new int[]{1, 5, 3}));
        System.out.println(maxTriple(new int[]{5, 2, 3}));
        System.out.println(maxTriple(new int[]{5, 1, 7, 9, 7, 8, 1}));
        System.out.println(maxTriple(new int[]{5, 1, 7, 3, 7, 8, 1}));
        System.out.println(maxTriple(new int[]{1, 7, 3, 1, 5}));
    }
}
