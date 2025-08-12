public class StartOne {
    public int countStartsWithOne(int[] a, int[] b) {
        if ((a.length > 0 && a[0] == 1) && (b.length > 0 && b[0] == 1)) {
            return 2;
        }
        if ((a.length > 0 && a[0] == 1) || (b.length > 0 && b[0] == 1)) {
            return 1;
        }
        return 0;
    }
}





