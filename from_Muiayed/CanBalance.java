import java.util.Arrays;

public class CanBalance {
    public static boolean canBalance(int[] nums) {
        int total = 0;
        for (int n : nums) total += n;

        if (total % 2 != 0) return false;

        int target = total / 2;
        int leftSum = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            if (leftSum == target) return true;
        }
        return false;
    }

    // Quick sanity check
    public static void main(String[] args) {
        System.out.println(canBalance(new int[]{1, 1, 1, 2, 1}));
        System.out.println(canBalance(new int[]{2, 1, 1, 2, 1}));
        System.out.println(canBalance(new int[]{10, 10}));
    }
}