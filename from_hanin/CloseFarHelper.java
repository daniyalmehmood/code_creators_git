public class CloseFarHelper {
    public static boolean isCloseAndFar(int a, int b, int c) {
        boolean bClose = Math.abs(b - a) <= 1;
        boolean cClose = Math.abs(c - a) <= 1;

        boolean bFar = Math.abs(b - a) >= 2 && Math.abs(b - c) >= 2;
        boolean cFar = Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2;

        return (bClose && cFar) || (cClose && bFar);
    }
}

