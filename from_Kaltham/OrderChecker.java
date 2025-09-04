//Logic-1 > inOrder


public class OrderChecker {
    public boolean isInOrder(int a, int b, int c, boolean bOk) {
        if (!bOk) {
            if (b > a && c > b) {
                return true;
            } else {
                return false;
            }
        } else {
            if (c > b) {
                return true;
            }
            return false;
        }

    }
}