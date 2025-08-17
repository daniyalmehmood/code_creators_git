public class NumberComparer {

    public int getClosestToTen(int a, int b) {
        int aDiff= Math.abs(a -10);
        int bDiff= Math.abs(b-10);

        if (aDiff<bDiff) return a;
        if (aDiff>bDiff) return b;
        return 0;
    }
}
