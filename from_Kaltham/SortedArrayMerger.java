//AP-1 > mergeTwo

public class SortedArrayMerger {
    public String[]mergeSortedArrays(String[]a, String[]b, int n) {
        String[]newArray = new String[n];
        int count = 0;
        int indexA = 0;
        int indexB = 0;
        while (count < n) {
            if (a[indexA].compareTo(b[indexB]) == 0) {
                newArray[count++] = a[indexA++];
                indexB++;
            } else if (a[indexA].compareTo(b[indexB]) < 0) {
                newArray[count++] = a[indexA++];

            } else if (a[indexA].compareTo(b[indexB]) > 0) {
                newArray[count++] = b[indexB++];

            }
        }

        return newArray;
    }
}