public class CloseFarChecker {
    public boolean  isOneCloseAndOtherFar(int a, int b, int c) {
        if (Math.abs(a - b) <= 1 && Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2) {
            return true;
        }
        if (Math.abs(a - c) <= 1 && Math.abs(b - a) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
