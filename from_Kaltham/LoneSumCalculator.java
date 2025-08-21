//Logic-2 > loneSum


public class LoneSumCalculator {
    public int calculateLoneSum(int a, int b, int c) {
        if (a != b && b != c && c != a) {
            return a + b + c;
        }
        if (b != a && b != c) {
            return b;
        }
        if (a != b && a != c) {
            return a;
        }
        if (c != a && c != b) {
            return c;
        }
        return 0;

    }
}
