public class SplitOddTen {
    public static boolean splitOddTenRecursive(int[] nums) {
        return splitOddTenRecursive(0, nums, 0, 0);
    }

    boolean splitOddTenRecursive(int start, int[] nums, int sumTenGroup, int sumOddGroup) {
        if (start >= nums.length)
            return (sumTenGroup % 10 == 0) && (sumOddGroup % 2 == 1);

        int current = nums[start];
        return splitOddTenRecursive(start + 1, nums, sumTenGroup + current, sumOddGroup) || splitOddTenRecursive(start + 1, nums, sumTenGroup, sumOddGroup + current);
    }

    public static void main(String[] args) {
        System.out.println(splitOddTenRecursive(new int[]{5, 5, 5}));
        System.out.println(splitOddTenRecursive(new int[]{5, 5, 6}));
        System.out.println(splitOddTenRecursive(new int[]{5, 5, 6, 1}));
    }
}

