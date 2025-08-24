public class LastAndFirstMatch {
    public static boolean lastAndFirstMatch(int[] a, int[] b) {
        int lastIndexOfA = a[a.length - 1];
        int lastIndexOfB = b[b.length - 1];
        if (a.length >= 1 && b.length >= 1) {
            if ((lastIndexOfA == lastIndexOfB) || (a[0] == b[0])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(lastAndFirstMatch(new int[]{1, 2, 3}, new int[]{7, 3}));
        System.out.println(lastAndFirstMatch(new int[]{1, 2, 3}, new int[]{7, 3, 2}));
        System.out.println(lastAndFirstMatch(new int[]{1, 2, 3}, new int[]{1, 3}));
        System.out.println(lastAndFirstMatch(new int[]{1, 2, 3}, new int[]{1}));
        System.out.println(lastAndFirstMatch(new int[]{1, 2, 3}, new int[]{2}));
    }
}
