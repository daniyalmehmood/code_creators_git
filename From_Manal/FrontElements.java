import java.util.Arrays;

public class FrontElements {

    // This method returns a new array with the first element of each array if present
    public static int[] getFirstElements(int[] a, int[] b) {
        // Case: both arrays have elements
        if (a.length > 0 && b.length > 0) {
            return new int[] { a[0], b[0] };
        }

        // Case: only a has elements
        if (a.length > 0) {
            return new int[] { a[0] };
        }

        // Case: only b has elements
        if (b.length > 0) {
            return new int[] { b[0] };
        }

        // Case: both are empty
        return new int[] {};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFirstElements(new int[] {1, 2, 3}, new int[] {7, 9, 8}))); // [1, 7]
        System.out.println(Arrays.toString(getFirstElements(new int[] {1}, new int[] {2})));             // [1, 2]
        System.out.println(Arrays.toString(getFirstElements(new int[] {1, 7}, new int[] {})));           // [1]
        System.out.println(Arrays.toString(getFirstElements(new int[] {}, new int[] {})));               // []
    }
}