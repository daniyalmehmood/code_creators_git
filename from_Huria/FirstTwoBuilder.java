import java.util.Arrays;

public class FirstTwoBuilder {
    public static int[] firstTwoBuilder(int[] a, int[] b) {
        if (a.length >= 2) {
            return new int[]{a[0], a[1]};
        } else if (a.length == 1 && b.length >= 1) {
            return new int[]{a[0], b[0]};
        } else if (a.length == 0 && b.length > 1) {
            return new int[]{b[0], b[1]};
        } else
            return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(firstTwoBuilder(new int[]{4, 5}, new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(firstTwoBuilder(new int[]{4}, new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(firstTwoBuilder(new int[]{}, new int[]{1, 2})));
        System.out.println(Arrays.toString(firstTwoBuilder(new int[]{}, new int[]{})));
        System.out.println(Arrays.toString(firstTwoBuilder(new int[]{3}, new int[]{1})));
    }
}
