public class ArrayFrontElements {
    public int[] getFrontElements(int[] a, int[] b) {
        if (a.length > 0 && b.length > 0) {
            // Both arrays have at least one element
            return new int[]{a[0], b[0]};
        } else if (a.length > 0) {
            // Only array 'a' has elements
            return new int[]{a[0]};
        } else if (b.length > 0) {
            // Only array 'b' has elements
            return new int[]{b[0]};
        } else {
            //  return an empty array
            return new int[0];
        }
    }
}

