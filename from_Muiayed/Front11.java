public class Front11 {
    public int[] front11(int[] a, int[] b) {
        int aLen = a.length > 0 ? 1 : 0;
        int bLen = b.length > 0 ? 1 : 0;
        int[] res = new int[aLen + bLen];

        if (aLen == 1) res[0] = a[0];
        if (bLen == 1) res[aLen] = b[0];
        return res;
    }
}