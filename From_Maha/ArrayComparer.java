public class ArrayComparer {
    public static boolean hasCommonEnd(int[] a, int[] b) {
        // Compare first elements OR last elements of both arrays
        if ((a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1])) {
            return true;
        }
        return false;
    }
}
