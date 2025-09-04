//Logic-1 > in1To10

public class RangeChecker {
    public boolean isInRange(int n, boolean outsideMode) {
        if (!outsideMode) {
            if (n >= 1 && n <= 10) {
                return true;
            } else {
                return false;
            }

        } else {
            if (n <= 1 || n >= 10) {
                return true;
            } else {
                return false;
            }

        }
    }
}