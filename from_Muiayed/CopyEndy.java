import java.util.Arrays;

public class CopyEndy {
    public static int[] copyEndy(int[] nums, int count) {
        int[] res = new int[count];
        int idx = 0;
        for (int n : nums) {
            if (isEndy(n)) {
                res[idx++] = n;
                if (idx == count) break;
            }
        }
        return res;
    }

    private static boolean isEndy(int n) {
        return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(copyEndy(new int[]{9, 11, 90, 22, 6}, 2)));
        System.out.println(Arrays.toString(copyEndy(new int[]{9, 11, 90, 22, 6}, 3)));
        System.out.println(Arrays.toString(copyEndy(new int[]{12, 1, 1, 13, 0, 20}, 2)));
    }
}