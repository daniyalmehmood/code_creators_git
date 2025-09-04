public class StartOne {
    public int startOne(int[]a, int[]b) {

        int count = 0;
        if (a.length >= 1 && a[0] == 1) {
            count++;
        }
        if (b.length >= 1 && b[0] == 1) {
            count++;
        }
        return count;
    }
}