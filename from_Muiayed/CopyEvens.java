import java.util.Arrays;

public class CopyEvens {
    public static int[] copyEvens(int[] nums, int count) {
        int[] res = new int[count];
        int idx = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                res[idx++] = n;
                if (idx == count) break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(copyEvens(new int[]{3, 2, 4, 5, 8}, 2)));
        System.out.println(Arrays.toString(copyEvens(new int[]{3, 2, 4, 5, 8}, 3)));
        System.out.println(Arrays.toString(copyEvens(new int[]{6, 1, 2, 4, 5, 8}, 3)));
    }
}