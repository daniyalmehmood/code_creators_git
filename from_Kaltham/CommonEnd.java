public class CommonEnd {
    public boolean commonEnd(int[]a, int[]b) {
        int newLength = Math.min(a.length, b.length);
        if (a.length >= 1 && b.length >= 1) {
            for (int i = 0; i < newLength; i++) {
                if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}