import java.util.Arrays;

public class MiddlElementsChecker {
    public static int[] getMiddleElementsFromTwoArrays(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getMiddleElementsFromTwoArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
    }
}
