//Logic-1 > love6

public class LoveSixChecker {
    public boolean isLoveSix(int a, int b) {
        if (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6) {
            return true;
        }
        return false;
    }
}