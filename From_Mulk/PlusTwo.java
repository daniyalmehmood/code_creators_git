public class PlusTwo {
    public int[] mergeTwoPairs(int[] a, int[] b) {
        if (a.length == 2 && b.length == 2) {
            int[] sum = {a[0], a[1], b[0], b[1]};
            return sum;
        }
        return new int[0];
    }
}
