public class MakeTwo {
    public int[] combineFirstTwoElements(int[] a, int[] b) {
        if (a.length == 3) {
            return new int[]{a[0], a[1]};
        }
        if (a.length == 2) {
            return new int[]{a[0], a[1]};
        }
        if (a.length == 1) {
            return new int[]{a[0], b[0]};
        }
        if (a.length == 0) {
            return new int[]{b[0], b[1]};
        }
        return new int[0];
    }
}