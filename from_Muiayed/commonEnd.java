public class commonEnd {
    public boolean commonEnd(int[] a, int[] b) {
        return a.length > 0 && b.length > 0 &&
                (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }

    public static void main(String[] args) {
        commonEnd ce = new commonEnd();
        System.out.println(ce.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3})); // true
        System.out.println(ce.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2})); // false
        System.out.println(ce.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3})); // true
    }
}