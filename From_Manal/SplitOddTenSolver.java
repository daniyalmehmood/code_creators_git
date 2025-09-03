public class SplitOdd10Solver {
    public boolean splitOddTen(int[] nums) {
        return helper(0, nums, 0, 0);
    }

    private boolean helper(int index, int[] nums, int sum1, int sum2) {
        if (index >= nums.length)
            return (sum1 % 10 == 0) && (sum2 % 2 == 1);

        int curr = nums[index];
        return helper(index + 1, nums, sum1 + curr, sum2) || helper(index + 1, nums, sum1, sum2 + curr);
    }

    public static void main(String[] args) {
        SplitOdd10Solver solver = new SplitOdd10Solver();
        System.out.println(solver.splitOddTen(new int[]{5,5,5}));
        System.out.println(solver.splitOddTen(new int[]{5,5,6}));
        System.out.println(solver.splitOddTen(new int[]{5,5,6,1}));
    }
}

