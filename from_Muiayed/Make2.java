public class Make2 {
    public int[] make2(int[] a, int[] b) {
        int[] out = new int[2];
        int idx = 0;

        for (int i = 0; i < a.length && idx < 2; i++) {
            out[idx++] = a[i];
        }
        for (int i = 0; i < b.length && idx < 2; i++) {
            out[idx++] = b[i];
        }
        return out;
    }
    public static void main(String[] args) {
        Make2 m = new Make2();
        int[] out = m.make2(new int[]{4, 5}, new int[]{1, 2, 3});
        System.out.println(out[0] + " " + out[1]);
    }
}
