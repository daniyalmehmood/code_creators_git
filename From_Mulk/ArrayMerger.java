//AP-1 > mergeTwo
public class ArrayMerger {
    public String[] mergeTwoOrderedArraysNoDuplicates(String[] a, String[] b, int n) {
        String[] result = new String[n];
        int indexa = 0;
        int indexb = 0;
        for (int i = 0; i < n; i++) {
            if ((a[indexa].compareTo(b[indexb])) == 0) {
                result[i] = a[indexa++];
                indexb++;

            } else if ((a[indexa].compareTo(b[indexb])) < 0) {
                result[i] = a[indexa++];
            } else {
                result[i] = b[indexb++];
            }
        }

        return result;
    }
}