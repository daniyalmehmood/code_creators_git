import java.util.Arrays;

public class MakeTwo {
    public static int[] makeTwoElement(int[] a, int[] b) {
        int[] result = new int[2];
        if (a.length >= 2) {
            result[0] = a[0];
            result[1] = a[1];

        } else if (a.length == 1) {
            result[0] = a[0];
            result[1] = b[0];
        } else {
            result[0] = b[0];
            result[1] = b[1];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeTwoElement(new int[]{4, 5}, new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(makeTwoElement(new int[]{4}, new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(makeTwoElement(new int[]{}, new int[]{1, 2})));
    }
}
