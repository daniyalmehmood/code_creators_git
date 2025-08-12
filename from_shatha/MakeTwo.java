import java.util.Arrays;

public class MakeTwo {
    public static int[] make2(int[] a, int[] b) {
        if (a.length >= 2) {
            return new int[] {a[0], a[1]};
        } else if (a.length == 1) {
            return new int[] {a[0], b[0]};
        } else {
            return new int[] {b[0], b[1]};
        }
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(make2(new int[]{4, 5},new int[]{1,2,3})));
        System.out.println(Arrays.toString(make2(new int[]{4},new int[]{1,2,3})));
        System.out.println(Arrays.toString(make2(new int[]{},new int[]{1,2})));
    }

}
