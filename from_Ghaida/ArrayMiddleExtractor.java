public class ArrayMiddleExtractor {
    public static void main(String[] args) {
        System.out.println(getMiddleElements(new int[]{1, 2, 3}, new int[]{4, 5, 6}));// → [2, 5]
        System.out.println(getMiddleElements(new int[]{7, 7, 7}, new int[]{3, 8, 0}));// → [7, 8]
        System.out.println(getMiddleElements(new int[]{5, 2, 9}, new int[]{1, 4, 5}));// → [2, 4]
    }
    public static int[] getMiddleElements(int[] a, int[] b) {
        return new int[] {a[1], b[1]};
    }
}