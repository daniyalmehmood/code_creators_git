import java.util.Arrays;

public class WithoutTen {
    public static int[] withoutTen(int[] nums) {
        int[] res = new int[nums.length];
        int idx = 0;
        for (int n : nums) {
            if (n != 10) res[idx++] = n;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(withoutTen(new int[]{1, 10, 10, 2})));
        System.out.println(Arrays.toString(withoutTen(new int[]{10, 2, 10})));
        System.out.println(Arrays.toString(withoutTen(new int[]{1, 99, 10})));
    }
}