//Logic-1 > inOrderEqual


public class OrderEqualityChecker {
    public boolean isInOrderEqual(int a, int b, int c, boolean equalOk) {
        if (!equalOk) {
            if (a < b && b < c) {
                return true;
            } else {
                return false;
            }
        } else {
            if (a <= b && b <= c) {
                return true;
            }
            return false;
        }
    }
}