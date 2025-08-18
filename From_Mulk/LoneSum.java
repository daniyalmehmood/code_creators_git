public class LoneSum {
    public int sumIfNotEqual(int a, int b, int c) {
        if (a == b && b == c) {
            return 0;
        }
        if (a == b) {
            return c;
        }
        if (b == c) {
            return a;
        }
        if (c == a) {
            return b;

        }
        return a + b + c;
    }
}





