public class ArrayMerger {
    // Merges two arrays of length 2 into a single array of length 4
    public static int[] mergeTwoPairs(int[] a, int[] b) {
        int[] newArray = new int[4];
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            newArray[a.length + i] = b[i];
        }
        return newArray;
    }
}

