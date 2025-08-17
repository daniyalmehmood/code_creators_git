public class InOrder {
    public boolean isIncreasingOrder(int a, int b, int c, boolean bOk) {
        if (c > b && bOk) {
            return true;
        } else if (b > a && c > b) {
            return true;
        } else {
            return false;
        }
    }
}
