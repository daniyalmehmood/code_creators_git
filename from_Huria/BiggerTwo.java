import java.util.Arrays;

public class BiggerTwo {
    public static int[] biggerTwo(int[] a, int[] b) {
        if (a.length == 2 && b.length == 2) {
            int aSum = a[0] + a[1];
            int bSum = b[0] + b[1];
            if (aSum > bSum) {
                return a;
            } else if (bSum > aSum) {
                return b;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(biggerTwo(new int[]{1, 2}, new int[]{3, 4})));
        System.out.println(Arrays.toString(biggerTwo(new int[]{3, 4}, new int[]{1, 2})));
        System.out.println(Arrays.toString(biggerTwo(new int[]{1, 3}, new int[]{2, 2})));
        System.out.println(Arrays.toString(biggerTwo(new int[]{6, 7}, new int[]{3, 1})));
    }
}
