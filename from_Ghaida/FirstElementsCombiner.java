import java.util.Arrays;

public class FirstElementsCombiner {//Array-1 > front11
    public static void main(String[] args) {
        System.out.println(Arrays.toString(combineFirstElements(new int[] {1, 2, 3}, new int[]{7, 9, 8})));// → [1, 7]
        System.out.println(Arrays.toString(combineFirstElements(new int[] {1}, new int[]{2})));// → [1, 2]
        System.out.println(Arrays.toString(combineFirstElements(new int[]{1, 7}, new int[]{})));// → [1]
    }
    public static int[] combineFirstElements(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) {
            return new int[0];
        }
        else if (b.length == 0) {
            return new int[] {a[0]};
        }
        else if (a.length == 0) {
            return new int[]{b[0]};
        }
        return new int[] {a[0], b[0]};
    }
}