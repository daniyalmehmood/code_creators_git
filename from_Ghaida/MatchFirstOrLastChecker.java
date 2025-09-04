public class MatchFirstOrLastChecker {
    public static void main(String[] args) {
        System.out.println(hasSameFirstOrLast(new int[]{1, 2, 3}, new int[]{7, 3})); // → true
        System.out.println(hasSameFirstOrLast(new int[]{1, 2, 3}, new int[]{7, 3, 2})); // false
        System.out.println(hasSameFirstOrLast(new int[]{1, 2, 3}, new int[]{1, 3})); // true
    }

    public static boolean hasSameFirstOrLast(int[] a, int[] b) {
        if (a.length >= 1 && b.length >= 1) {
            if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
                return true;
            }
        }
        return false;
    }
}
