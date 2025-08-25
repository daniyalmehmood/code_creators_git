import java.util.Arrays;

public class ZeroFront {
    public static int[] zeroFront(int[] nums) {
        int[] res = new int[nums.length];
        int z = 0;
        for (int n : nums) if (n == 0) res[z++] = 0;
        for (int n : nums) if (n != 0) res[z++] = n;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(zeroFront(new int[]{1, 0, 0, 1})));
        System.out.println(Arrays.toString(zeroFront(new int[]{0, 1, 1, 0, 1})));
        System.out.println(Arrays.toString(zeroFront(new int[]{1, 0})));
    }
}