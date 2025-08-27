// AP-1 > mergeTwo
public class StringArraysMerger {
    public String[] mergeTwoSortedStrings(String[] a, String[] b, int n) {
        String[] result = new String[n];
        int i = 0;
        int j = 0;
        for (int index = 0; index < n; index++) {
            int aCompareToB = a[i].compareTo(b[j]);
            if (aCompareToB < 0) {
                result[index] = a[i];
                i++;
            } else if (aCompareToB > 0) {
                result[index] = b[j];
                j++;
            } else {
                result[index] = a[i];
                i++;
                j++;
            }
        }
        return result;
    }
}