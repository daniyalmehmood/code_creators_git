// This class provides a method to check if two arrays have the same first or last element
public class ArrayEndComparer {

    public boolean hasCommonStartOrEnd(int[] a, int[] b) {
        //  loop through array a
        for (int i = 0; i < a.length; i++) {
            //  loop through array b
            for (int j = 0; j < b.length; j++) {
                // No operation inside
            }

            // Check if first or last elements match
            if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
                return true;
            }
        }

        return false;
    }

}
