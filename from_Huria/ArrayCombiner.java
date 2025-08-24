import java.util.Arrays;

public class ArrayCombiner {
    public static int[] combineTwo(int[] a, int[] b) {
        int plusTwo[] = {a[0], a[1], b[0], b[1]};
        return plusTwo;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(combineTwo(new int[]{1, 2}, new int[]{3, 4})));
        System.out.println(Arrays.toString(combineTwo(new int[]{4, 4}, new int[]{4, 4, 2, 2})));
        System.out.println(Arrays.toString(combineTwo(new int[]{9, 2}, new int[]{3, 4})));
    }
}
