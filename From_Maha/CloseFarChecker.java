public class CloseFarChecker {
    // Returns true if one value is close to 'a' (within 1) and the other is far (at least 2 away from both a and the close one)
    public boolean isCloseAndFar(int a, int b, int c) {
        if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        }
        if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        }
        return false;
    }
}
