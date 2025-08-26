public class MergeTwoArrays { // AP-1 > mergeTwo

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(mergeFirstNFromTwoArrays(
                new String[] {"a", "c", "z"}, new String[] {"b", "f", "z"}, 3))); // → ["a", "b", "c"]
        System.out.println(java.util.Arrays.toString(mergeFirstNFromTwoArrays(
                new String[] {"a", "c", "z"}, new String[] {"c", "f", "z"}, 3))); // → ["a", "c", "f"]
        System.out.println(java.util.Arrays.toString(mergeFirstNFromTwoArrays(
                new String[] {"f", "g", "z"}, new String[] {"c", "f", "g"}, 3))); // → ["c", "f", "g"]
    }

    public static String[] mergeFirstNFromTwoArrays(String[] a, String[] b, int n) {
        String[] mergedArray = new String[n];
        int indexA = 0, indexB = 0, indexMerged = 0;
        while (indexMerged < n) {
            int compareStrings = a[indexA].compareTo(b[indexB]);
            if (compareStrings < 0) { // a[indexA] is smaller
                mergedArray[indexMerged++] = a[indexA++];
            }
            else if (compareStrings > 0) { // b[indexB] is smaller
                mergedArray[indexMerged++] = b[indexB++];
            }
            else { // equal(take one of them)
                mergedArray[indexMerged++] = a[indexA++];
                indexB++;//skip another one
            }
        }
        return mergedArray;
    }
}
