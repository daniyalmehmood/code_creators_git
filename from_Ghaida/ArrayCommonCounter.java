public class ArrayCommonCounter {//AP-1 > commonTwo
    public static void main(String[] args) {
        System.out.println(countCommonElements(new String[]{"a", "c", "x"}, new String[]{"b", "c", "d", "x"})); // 2
        System.out.println(countCommonElements(new String[]{"a", "c", "x"}, new String[]{"a", "b", "c", "x", "z"})); // 3
        System.out.println(countCommonElements(new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"})); // 3
    }
    public static int countCommonElements(String[] a, String[] b) {
        int countCommon = 0;
        int indexA = 0, indexB = 0;
        while (indexA < a.length && indexB < b.length) {
            int compareStrings = a[indexA].compareTo(b[indexB]);
            if (compareStrings < 0) {
                indexA++;
            }
            else if (compareStrings > 0) {
                indexB++;
            }
            else { // equal
                countCommon++;
                String value = a[indexA];
                // skip duplicates in arrayA
                while (indexA < a.length && a[indexA].equals(value)) indexA++;
                // skip duplicates in arrayB
                while (indexB < b.length && b[indexB].equals(value)) indexB++;
            }
        }
        return countCommon;
    }
}
