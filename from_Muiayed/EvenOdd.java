import java.util.Arrays;

public class EvenOdd {
    public static int[] evenOdd(int[] nums) {
        int[] res = new int[nums.length];
        int idx = 0;
        for (int n : nums) if (n % 2 == 0) res[idx++] = n;
        for (int n : nums) if (n % 2 != 0) res[idx++] = n;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1})));
        System.out.println(Arrays.toString(evenOdd(new int[]{3, 3, 2})));
        System.out.println(Arrays.toString(evenOdd(new int[]{2, 2, 2})));
    }
}