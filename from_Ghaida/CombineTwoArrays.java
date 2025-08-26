import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(addTwoArrays(new int[]{1, 2}, new int[]{3, 4})));// → [1, 2, 3, 4]
        System.out.println(Arrays.toString(addTwoArrays(new int[]{4, 4}, new int[]{2, 2})));// → [4, 4, 2, 2]
        System.out.println(Arrays.toString(addTwoArrays(new int[]{9, 2}, new int[]{3, 4})));// → [9, 2, 3, 4]);
    }
    public static int[] addTwoArrays(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }
}
