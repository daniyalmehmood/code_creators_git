public class SortedArrayMerger {
    public String[] mergeSortedArrays(String[] a, String[] b, int n) {
        int aI = 0;
        int bI = 0;
        String[] ret = new String[n];
        for (int i = 0; i < n; i++) {
            if (a[aI].compareTo(b[bI]) < 0) {
                ret[i] = a[aI];
            } else {
                ret[i] = b[bI];
                bI++;
            }
            while (aI < a.length && ret[i].equals(a[aI])) {
                aI++;
            }
            while (bI < b.length && ret[i].equals(b[bI])) {
                bI++;
            }
        }
        return ret;
    }

}
